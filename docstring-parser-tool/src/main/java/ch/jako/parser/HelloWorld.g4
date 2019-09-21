grammar HelloWorld;

hello: 'HELLO' ID;

ID: BIGLETTER SMALLLETTER+;
BIGLETTER: [A-Z];
SMALLLETTER: [a-z];
WS: [ \t\r\n]+ ->skip;