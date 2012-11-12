#!/bin/sh

export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:/opt/mqm/gskit8/lib;
export PATH=$PATH:/opt/mqm/gskit8/bin;
qmgr=/var/mqm/qmgrs;

###---ACCNT_QM---###
export ACCNT_SSL_DIR=$qmgr/ACCNT_QM/ssl
gsk8capicmd -keydb -create -db $ACCNT_SSL_DIR/key.kdb -pw mli123 -type cms -expire 365 -stash -fips 
gsk8capicmd -cert -create -db $ACCNT_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqaccnt_qm -dn "cn=linux02.isphereglobal.com" -size 1024 -x509version 3 -sig_alg SHA1WithRSA -expire 365
gsk8capicmd -cert -extract -db $ACCNT_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqaccnt_qm -target $ACCNT_SSL_DIR/accntqmCA -format ascii

###---CUST_QM---###
export CUST_SSL_DIR=$qmgr/CUST_QM/ssl
gsk8capicmd -keydb -create -db $CUST_SSL_DIR/key.kdb -pw mli123 -type cms -expire 365 -stash -fips 
gsk8capicmd -cert -create -db $CUST_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqcust_qm -dn "cn=linux02.isphereglobal.com" -size 1024 -x509version 3 -sig_alg SHA1WithRSA -expire 365
gsk8capicmd -cert -extract -db $CUST_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqcust_qm -target $CUST_SSL_DIR/custqmCA -format ascii

###---CARD_QM---###
export CARD_SSL_DIR=$qmgr/CARD_QM/ssl
gsk8capicmd -keydb -create -db $CARD_SSL_DIR/key.kdb -pw mli123 -type cms -expire 365 -stash -fips 
gsk8capicmd -cert -create -db $CARD_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqcard_qm -dn "cn=linux02.isphereglobal.com" -size 1024 -x509version 3 -sig_alg SHA1WithRSA -expire 365
gsk8capicmd -cert -extract -db $CARD_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqcard_qm -target $CARD_SSL_DIR/cardqmCA -format ascii

###---TXN_QM---###
export TXN_SSL_DIR=$qmgr/TXN_QM/ssl
gsk8capicmd -keydb -create -db $TXN_SSL_DIR/key.kdb -pw mli123 -type cms -expire 365 -stash -fips 
gsk8capicmd -cert -create -db $TXN_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqtxn_qm -dn "cn=linux02.isphereglobal.com" -size 1024 -x509version 3 -sig_alg SHA1WithRSA -expire 365
gsk8capicmd -cert -extract -db $TXN_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqtxn_qm -target $TXN_SSL_DIR/txnqmCA -format ascii

###---REWARD_QM---###
export REWARD_SSL_DIR=$qmgr/REWARD_QM/ssl
gsk8capicmd -keydb -create -db $REWARD_SSL_DIR/key.kdb -pw mli123 -type cms -expire 365 -stash -fips 
gsk8capicmd -cert -create -db $REWARD_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqreward_qm -dn "cn=linux02.isphereglobal.com" -size 1024 -x509version 3 -sig_alg SHA1WithRSA -expire 365
gsk8capicmd -cert -extract -db $REWARD_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqreward_qm -target $REWARD_SSL_DIR/rewardqmCA -format ascii

###---APP_QM---###
export APP_SSL_DIR=$qmgr/APP_QM/ssl
gsk8capicmd -keydb -create -db $APP_SSL_DIR/key.kdb -pw mli123 -type cms -expire 365 -stash -fips 
gsk8capicmd -cert -create -db $APP_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqapp_qm -dn "cn=linux02.isphereglobal.com" -size 1024 -x509version 3 -sig_alg SHA1WithRSA -expire 365
gsk8capicmd -cert -extract -db $APP_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqapp_qm -target $APP_SSL_DIR/appqmCA -format ascii





