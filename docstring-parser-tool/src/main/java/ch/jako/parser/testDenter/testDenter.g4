grammar testDenter;
@header {
   package ch.jako.parser.testDenter;
  //import com.yuvalshavit.antlr4.DenterHelper;
}

calculus: NUMBER OPERATION NUMBER ANY_CHAR? EOF;

SPACES: [ \t\r\n] -> skip;

ANY_CHAR: .;

NUMBER: [0-9]+;

OPERATION: '+' | '-' | '*' | '/';

BIGLETTER: [A-Z];

