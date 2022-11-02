//=========================================================
//포인터
//=========================================================
//-->자기 자신의 값으로 다른 메모리 공간의 주소값을 갖는 변수
//-->주소값을 통해 실제 데이터를 참조하는 변수
//=========================================================
// 포인터 변수 선언
//=========================================================
#include <stdio.h>
int main(void) {
	int num = 1234;
	int *p;
	p = &num;
	printf("%d\n", p);
	printf("%d\n", *p);
	printf("%d\n", num);
	printf("%d\n", &num);
	return 0;
}