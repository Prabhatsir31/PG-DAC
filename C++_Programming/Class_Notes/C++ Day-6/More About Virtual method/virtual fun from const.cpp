#include<iostream>
using namespace std;
class base
{
public:
	base()
	{
		disp();
	}
	virtual void disp()
	{
		cout<<"in base disp"<<endl;
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
}

/* assembly output */



/*


base()

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

; 8    : 	{
; 9    : 		disp();

	mov	ecx, DWORD PTR _this$[ebp]
	call	?disp@base@@UAEXXZ			; base::disp

; 10   : 	}

	mov	eax, DWORD PTR _this$[ebp]
	pop	edi
	pop	esi
	pop	ebx
	add	esp, 204				; 000000ccH
	cmp	ebp, esp
	call	__RTC_CheckEsp
	mov	esp, ebp
	pop	ebp
	ret	0
??0base@@QAE@XZ ENDP					; base::base
_TEXT	ENDS


*/