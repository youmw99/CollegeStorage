#pragma once
#include <winsock2.h>
#include <windows.h>
#include <stdio.h>


#pragma comment(lib,"ws2_32.lib")
#pragma warning(disable:4996)

#define BUF_SIZE 4096
#define BUF_STAND 255
#define LIST_LIMIT 10

LPVOID doListThread(LPVOID p);
void FileSend(SOCKET p);
void ShowList(SOCKET p);
const LPVOID &Upload_To_Server(const SOCKET &ClientSocket);

typedef struct FILE_INFO {
	char filename[BUF_STAND];
	int filesize = 0;
};

typedef struct SOCKET_INFO {
	SOCKET ClientSocket;
	SOCKADDR_IN ClientAddr;
};

typedef struct FILE_LIST {
	char filename[BUF_STAND];
};
