grammar GrammarJfk;

mov: 'mov' WHITESPACE+ expression WHITESPACE* ',' WHITESPACE* registry WHITESPACE* NEWLINE ;
intc: 'int' WHITESPACE '0x80'  NEWLINE ;
push: 'push' WHITESPACE+ expression   NEWLINE;
xor:  'xor' WHITESPACE+ registry WHITESPACE* ',' WHITESPACE* registry WHITESPACE* NEWLINE;

registry : ('%eax'|'%ebx'|'%ecx'|'%edx');
command: (mov|intc|push|xor);
expression:
NUMBER
| registry
| '(' inner = expression ')'
| left=expression ' '* operator='*' ' '* right=expression
| left=expression ' '* operator='-'  ' '* right=expression
| left=expression ' '* operator='+'  ' '* right=expression;


NUMBER : [0-9]+;
NEWLINE: ('\r'? '\n' | '\r')+ ;
//WHITESPACE: ('\t'|' ') ;
WHITESPACE: ' ';
