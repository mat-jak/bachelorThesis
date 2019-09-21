grammar Oneliner;

@header {
   package ch.jako.parser.oneliner;
}

oneliner : NEWLINE* oneLine NEWLINE* EOF;

oneLine : UNKNOWN_CHAR+;

NEWLINE
    : ( '\r'? '\n' | '\r' | '\f' )
    ;

UNKNOWN_CHAR
    : .
    ;