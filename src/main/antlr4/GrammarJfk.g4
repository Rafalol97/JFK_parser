grammar GrammarJfk;

mov: 'mov' WHITESPACE expression WHITESPACE* ',' WHITESPACE* registry WHITESPACE*;
intc: 'int' WHITESPACE '0x80'   WHITESPACE* ;
push: 'push' WHITESPACE expression  WHITESPACE*;
xor:  'xor' WHITESPACE expression WHITESPACE* ',' WHITESPACE* registry WHITESPACE*;

registry : ('%eax'|'%ebx'|'%ecx'|'%edx');
command: (mov|intc|push|xor)? EOF;
expression:
NUMBER
| registry
| '(' inner = expression ')'
| left=expression WHITESPACE* operator='*'  WHITESPACE*  right=expression
| left=expression WHITESPACE* operator='-' WHITESPACE* right=expression
| left=expression WHITESPACE* operator='+' WHITESPACE* right=expression;


NUMBER : [0-9]+;
NEWLINE: ('\r'? '\n' | '\r')+ ;
WHITESPACE: WHITE|TAB;
WHITE: ' ';
TAB: '\t';
