grammar Test1;
NUMBER : [0-9]+;
 PLUS: '+';
 MINUS: '-';
 MULT: '*';
 DIV: '/';

WHITESPACE: ('\t' | ' ')+;


fragment WHITESPACEZERO:  ' '*;


NEWLINE: ('\r'? '\n' | '\r')+ ;
mov : 'mov' WHITESPACE expression WHITESPACE ',' WHITESPACE registry WHITESPACE NEWLINE ;
int : 'int' WHITESPACE '0x80'  NEWLINE ;
push : 'push' WHITESPACE expression   NEWLINE;
xor :  'xor' WHITESPACE expression WHITESPACE ',' WHITESPACE registry WHITESPACE NEWLINE;

registry : ('%eax'|'%ebx'|'%ecx'|'%edx');
operators : (' '*  PLUS ' '* | ' '* MINUS ' '* | ' '* MULT ' '* | ' '* DIV ' '*);

expression:
NUMBER
| registry
| '(' inner = expression ')'
| left=expression operator=operators right=expression ;



command: (mov|int|push|xor) command;
