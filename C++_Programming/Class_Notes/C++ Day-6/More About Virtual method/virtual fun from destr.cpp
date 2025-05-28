#include<iostream>
using namespace std;

class base
{
public:
	virtual void disp()
	{
		cout<<"in base disp"<<endl;
	}
	~base()
	{
		disp();
	}
};
class sub: public base
{
public:
	void disp()
	{
		cout<<"in sub disp"<<endl;
	}
};
int main()
{
	base *b=new sub;
	delete b;
}



/* assembly output  */


/*


_TEXT	SEGMENT
_this$ = -8						; size = 4
??1base@@QAE@XZ PROC					; base::~base, COMDAT
; _this$ = ecx

; 12   : 	{

	push	ebp
	mov	ebp, esp
	sub	esp, 204				; 000000ccH
	push	ebx
	push	esi
	push	edi
	push	ecx
	lea	edi, DWORD PTR [ebp-204]
	mov	ecx, 51					; 00000033H
	mov	eax, -858993460				; ccccccccH
	rep stosd
	pop	ecx
	mov	DWORD PTR _this$[ebp], ecx
	mov	eax, DWORD PTR _this$[ebp]
	mov	DWORD PTR [eax], OFFSET ??_7base@@6B@

; 13   : 		disp();

	mov	ecx, DWORD PTR _this$[ebp]
	call	?disp@base@@UAEXXZ			; base::disp

; 14   : 	}

	pop	edi
	pop	esi
	pop	ebx
	add	esp, 204				; 000000ccH
	cmp	ebp, esp
	call	__RTC_CheckEsp
	mov	esp, ebp
	pop	ebp
	ret	0
??1base@@QAE@XZ ENDP					; base::~base
_TEXT	ENDS


*/