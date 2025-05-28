#include<iostream>
using namespace std;
class base
{
public:
	void fun()
	{
		disp(); // depends on the content or referent if "fun" is invoked from pointer or reference.
	}
	virtual void disp()
	{
		cout << "in base disp" << endl;
	}
};
class sub : public base
{
public:
	void disp()
	{
		cout << "in sub disp" << endl;
	}
};
int main()
{
	base* b = new sub;
	b->disp(); // late binding for "disp"
	b->fun(); // early binding for "fun"
	base b1;
	b1.fun();// early binding for "fun"

	cout << "now let's try with reference" << endl;
	base first;
	sub second;
	base &ref1 = first;
	ref1.fun();

	base& ref2 = second;
	ref2.fun();


}



/* assembly output */


/*

; 27   : 	b->disp(); // late binding



	mov	eax, DWORD PTR _b$[ebp]
	mov	edx, DWORD PTR [eax]
	mov	esi, esp
	mov	ecx, DWORD PTR _b$[ebp]
	mov	eax, DWORD PTR [edx]
	call	eax
	cmp	esi, esp
	call	__RTC_CheckEsp


*/

/*

; 28   : 	b->fun(); // early binding

	mov	ecx, DWORD PTR _b$[ebp]
	call	?fun@base@@QAEXXZ			; base::fun

*/



/*

; 30   : 	b1.fun();// early binding

	lea	ecx, DWORD PTR _b1$[ebp]
	call	?fun@base@@QAEXXZ			; base::fun

*/

/*

code inside "fun()" member function




_TEXT	SEGMENT
_this$ = -8						; size = 4
?fun@base@@QAEXXZ PROC					; base::fun, COMDAT
; _this$ = ecx

; 8    : 	{

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

; 9    : 		disp(); // late binding bec u r invoking virtual method

	mov	eax, DWORD PTR _this$[ebp]
	mov	edx, DWORD PTR [eax]
	mov	esi, esp
	mov	ecx, DWORD PTR _this$[ebp]
	mov	eax, DWORD PTR [edx]
	call	eax
	cmp	esi, esp
	call	__RTC_CheckEsp

; 10   : 	}

	pop	edi
	pop	esi
	pop	ebx
	add	esp, 204				; 000000ccH
	cmp	ebp, esp
	call	__RTC_CheckEsp
	mov	esp, ebp
	pop	ebp
	ret	0
?fun@base@@QAEXXZ ENDP					; base::fun
_TEXT	ENDS


*/

	




