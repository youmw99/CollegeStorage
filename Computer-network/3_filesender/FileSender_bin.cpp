#include <winsock2.h>
#include <stdio.h>


#pragma comment(lib,"ws2_32.lib")
#pragma warning(disable:4996)

#define BUF_SIZE 4096
int main(void) {
	WSADATA wsa;
	//winsock dll 로딩
	if (WSAStartup(MAKEWORD(2, 2), &wsa) != 0) {
		puts("WSAStartup() error!!");
		return 0;
	}
	//====================================================================
	SOCKET ClientSocket
		= socket(AF_INET, SOCK_STREAM, IPPROTO_TCP);
	if (ClientSocket == INVALID_SOCKET) {
		puts("socket error!");
		return 0;
	}
	//접속할 서버의 주소
	SOCKADDR_IN ServerAddr;
	ServerAddr.sin_port = htons(8000);
	ServerAddr.sin_family = AF_INET;
	ServerAddr.sin_addr.s_addr = inet_addr("127.0.0.1");

	if (connect(ClientSocket, //클라이언트 소켓
		(SOCKADDR*)&ServerAddr, //접속할 서버주소
		sizeof(ServerAddr))//주소 크기
		== SOCKET_ERROR) {
		puts("connect error!");
		return 0;
	}
	char filename[255] = "pic2.jpg";
	//C언어 파일 입출력
	FILE * fp = fopen(filename, "rb");//파일 열기
	char buf[BUF_SIZE] = { 0 };
	int filesize = 0;
	//====================================================================
	fseek(fp, 0, SEEK_END);//파일의 마지막으로 이동
	filesize = ftell(fp);

	send(ClientSocket, filename, 255, 0);
	send(ClientSocket, (char*)&filesize, 4, 0);
	
	rewind(fp);//파일읽기 위치를 처음으로

	while (fread(buf, 1, BUF_SIZE, fp) != EOF) {
			send(ClientSocket, buf, BUF_SIZE, 0);//파일에서 바이너리 데이터를 읽어오기!
	}

	fclose(fp);//파일 닫기

	getchar();
	//====================================================================
	WSACleanup();//winsock dll 언로딩
	return 0;
}