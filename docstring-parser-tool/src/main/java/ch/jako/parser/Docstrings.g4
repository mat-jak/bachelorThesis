grammar Docstrings;

docstrings: HYPHEN? DIGIT;

test: '\'\'\'' .+? '\'\'\'';

// HYPHEN? DIGIT

WS: [ \t\r\n]+ -> skip;
BIGLETTER: [A-Z];
SMALLLETTER: [a-z];
DIGIT: [0-9];
//BIGDIGIT: (BIGLETTER | DIGIT);
//BULLET: HYPHEN? DIGIT;
HYPHEN: '-';
ANYCHAR: ()+?;