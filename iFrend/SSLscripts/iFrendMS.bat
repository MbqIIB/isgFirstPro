
set qmgr="C:\Program Files (x86)\IBM\WebSphere MQ\Qmgrs";

###---ACCNT_QM---###
set ACCNT_SSL_DIR=%qmgr%/ACCNT_QM/ssl
runmqckm -keydb -create -db %ACCNT_SSL_DIR%/key.kdb -pw ifrend123 -type cms -expire 365 -stash 
runmqckm -cert -create -db %ACCNT_SSL_DIR%/key.kdb -pw ifrend123 -label ibmwebspheremqaccnt_qm -dn "cn=ISG-PH-JDEV-006" -size 1024 -x509version 3 -sig_alg SHA1WithRSA -expire 365
runmqckm -cert -extract -db %ACCNT_SSL_DIR%/key.kdb -pw ifrend123 -label ibmwebspheremqaccnt_qm -target %ACCNT_SSL_DIR%/accntqmCA -format ascii


###---CUST_QM---###
set CUST_SSL_DIR=%qmgr%/CUST_QM/ssl
runmqckm -keydb -create -db %CUST_SSL_DIR%/key.kdb -pw ifrend123 -type cms -expire 365 -stash
runmqckm -cert -create -db %CUST_SSL_DIR%/key.kdb -pw ifrend123 -label ibmwebspheremqcust_qm -dn "cn=ISG-PH-JDEV-006" -size 1024 -x509version 3 -sig_alg SHA1WithRSA -expire 365
runmqckm -cert -extract -db %CUST_SSL_DIR%/key.kdb -pw ifrend123 -label ibmwebspheremqcust_qm -target %CUST_SSL_DIR%/custqmCA -format ascii

###---CARD_QM---###
set CARD_SSL_DIR=%qmgr%/CARD_QM/ssl
runmqckm -keydb -create -db %CARD_SSL_DIR%/key.kdb -pw ifrend123 -type cms -expire 365 -stash 
runmqckm -cert -create -db %CARD_SSL_DIR%/key.kdb -pw ifrend123 -label ibmwebspheremqcard_qm -dn "cn=ISG-PH-JDEV-006" -size 1024 -x509version 3 -sig_alg SHA1WithRSA -expire 365
runmqckm -cert -extract -db %CARD_SSL_DIR%/key.kdb -pw ifrend123 -label ibmwebspheremqcard_qm -target %CARD_SSL_DIR%/cardqmCA -format ascii

###---TXN_QM---###
set TXN_SSL_DIR=%qmgr%/TXN_QM/ssl
runmqckm -keydb -create -db %TXN_SSL_DIR%/key.kdb -pw ifrend123 -type cms -expire 365 -stash
runmqckm -cert -create -db %TXN_SSL_DIR%/key.kdb -pw ifrend123 -label ibmwebspheremqtxn_qm -dn "cn=ISG-PH-JDEV-006" -size 1024 -x509version 3 -sig_alg SHA1WithRSA -expire 365
runmqckm -cert -extract -db %TXN_SSL_DIR%/key.kdb -pw ifrend123 -label ibmwebspheremqtxn_qm -target %TXN_SSL_DIR%/txnqmCA -format ascii

###---REWARD_QM---###
set REWARD_SSL_DIR=%qmgr%/REWARD_QM/ssl
runmqckm -keydb -create -db %REWARD_SSL_DIR%/key.kdb -pw ifrend123 -type cms -expire 365 -stash
runmqckm -cert -create -db %REWARD_SSL_DIR%/key.kdb -pw ifrend123 -label ibmwebspheremqreward_qm -dn "cn=ISG-PH-JDEV-006" -size 1024 -x509version 3 -sig_alg SHA1WithRSA -expire 365
runmqckm -cert -extract -db %REWARD_SSL_DIR%/key.kdb -pw ifrend123 -label ibmwebspheremqreward_qm -target %REWARD_SSL_DIR%/rewardqmCA -format ascii

###---APP_QM---###
set APP_SSL_DIR=%qmgr%/APP_QM/ssl
runmqckm -keydb -create -db %APP_SSL_DIR%/key.kdb -pw ifrend123 -type cms -expire 365 -stash
runmqckm -cert -create -db %APP_SSL_DIR%/key.kdb -pw ifrend123 -label ibmwebspheremqapp_qm -dn "cn=ISG-PH-JDEV-006" -size 1024 -x509version 3 -sig_alg SHA1WithRSA -expire 365
runmqckm -cert -extract -db %APP_SSL_DIR%/key.kdb -pw ifrend123 -label ibmwebspheremqapp_qm -target %APP_SSL_DIR%/appqmCA -format ascii





