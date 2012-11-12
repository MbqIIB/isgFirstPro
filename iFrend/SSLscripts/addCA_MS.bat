
set qmgr="C:\Program Files (x86)\IBM\WebSphere MQ\Qmgrs";

set ACCNT_SSL_DIR=%qmgr%/ACCNT_QM/ssl
runmqckm -cert -add -db %ACCNT_SSL_DIR%/key.kdb -pw ifrend123 -label winmliaccntqmCA -file %ACCNT_SSL_DIR%/winmliaccntqmCA -format ascii

set CUST_SSL_DIR=%qmgr%/CUST_QM/ssl
runmqckm -cert -add -db %CUST_SSL_DIR%/key.kdb -pw ifrend123 -label winmlicustqmCA -file %CUST_SSL_DIR%/winmlicustqmCA -format ascii

set CARD_SSL_DIR=%qmgr%/CARD_QM/ssl
runmqckm -cert -add -db %CARD_SSL_DIR%/key.kdb -pw ifrend123 -label winmlicardqmCA -file %CARD_SSL_DIR%/winmlicardqmCA -format ascii

set TXN_SSL_DIR=%qmgr%/TXN_QM/ssl
runmqckm -cert -add -db %TXN_SSL_DIR%/key.kdb -pw ifrend123 -label winmlitxnqmCA -file %TXN_SSL_DIR%/winmlitxnqmCA -format ascii

set REWARD_SSL_DIR=%qmgr%/REWARD_QM/ssl
runmqckm -cert -add -db %REWARD_SSL_DIR%/key.kdb -pw ifrend123 -label winmlirewardqmCA -file %REWARD_SSL_DIR%/winmlirewardqmCA -format ascii

set APP_SSL_DIR=%qmgr%/APP_QM/ssl
runmqckm -cert -add -db %APP_SSL_DIR%/key.kdb -pw ifrend123 -label winmliappqmCA -file %APP_SSL_DIR%/winmliappqmCA -format ascii


