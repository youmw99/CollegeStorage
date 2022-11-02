//======================================================
// 선형 자료구조(리스트, 시퀀스)
//======================================================
//배열(연접 리스트)
//-장점
// 속도가 빠르다
// 비교적 구현이 쉽다.
// 가장 많이 사용되는 자료구조
//-단점
// 크기가 고정이다 -->동적배열로 해결가능
// 앞이나 중간에서 삽입/삭제속도가 느리다
//======================================================
// 연결리스트(Linked List)
//======================================================
//--> 필요시 노드가 생성되는 동적 자료구조
//--> 삽입, 삭제 속도가 균일하게 빠르다.
//--> 노드(node):할당되는 데이터 + 링크의 블럭
//--> 링크(link):다음 노드에 대한 포인터
//======================================================
// 단일 연결리스트(Single Linked List)
//======================================================
// [ 10 ]    [ 20 ]    [    ]
// [link]--->[    ]--->[    ]
//======================================================
#include <stdio.h>
#include <malloc.h>
//======================================================
// 구조체 선언
//======================================================
typedef struct node {
	int data;
	struct node * next;
}NODE;
//======================================================
//전역변수
NODE *head, *tail;
//======================================================
// 리스트의 초기상태를 만든다 (head, tail)
//======================================================
void InitList() {
	head = (NODE*)malloc(sizeof(NODE));
	tail = (NODE*)malloc(sizeof(NODE));
	
	//(*head).next = tail;
	head->next = tail;
	tail->next = tail;
}
//======================================================
// head, tail 더미 노드 사용 구현
//======================================================
//======================================================
// insert( _where,// 삽입될 위치 
//			data)// 값
//======================================================
void Insert(NODE*Where, int value) {
	NODE * NewNode = (NODE*)malloc(sizeof(NODE));
	NewNode->data = value;
	NewNode->next = Where->next;
	Where->next = NewNode;
}
//======================================================
// 리스트 전체 출력함수
//======================================================
void show() {
	NODE  *p = head->next;
	while (p!=tail) {
		printf("%d-->", p->data);
		p = p->next;
	}
	puts("");
}
//======================================================
// 삭제 함수
// erase(Int key) :key 값에 해당하는 노드 삭제
//======================================================
void erase(int key) {
	NODE *p = head->next;
	NODE *s = head;
	while (p!=tail) {
		if (p->data == key) {
			s->next = p->next;
			free(p);
			return;
		}
		else {
			s = p;
			p = p->next;
		}
	}
}
//======================================================
// 검색 함수
// NODE(Int key) :key 값에 해당하는 노드의 포인터를 리턴
//======================================================
NODE * find(int key) {
	NODE *p = head->next;
	while (p!=tail) {
		if (p->data == key) {
			return p;
		}
		else { 
			p = p->next;
		}
	}
}
int main(void) {
	InitList();
	Insert(head, 10);
	Insert(find(10), 20);
	Insert(find(20), 30);
	Insert(find(30), 40);
	Insert(find(40), 50);
	show();
	erase(10);
	show();
	erase(20);
	show();
	erase(30);
	show();
	erase(40);
	show();
	erase(50);
	show();
	return 0;
}