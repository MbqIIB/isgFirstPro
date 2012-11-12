#!/bin/sh

export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:/opt/mqm/gskit8/lib;
export PATH=$PATH:/opt/mqm/gskit8/bin;
qmgr=/var/mqm/qmgrs;

###---MLI_ACCNT_QM---###
export ACCNT_SSL_DIR=$qmgr/MLI_ACCNT_QM/ssl
gsk8capicmd -keydb -create -db $ACCNT_SSL_DIR/key.kdb -pw mli123 -type cms -expire 365 -stash -fips 
gsk8capicmd -cert -create -db $ACCNT_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqmli_accnt_qm -dn "cn=linux02.isphereglobal.com" -size 1024 -x509version 3 -sig_alg SHA1WithRSA -expire 365
gsk8capicmd -cert -extract -db $ACCNT_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqmli_accnt_qm -target $ACCNT_SSL_DIR/mliaccntqmCA -format ascii

###---MLI_CUST_QM---###
export CUST_SSL_DIR=$qmgr/MLI_CUST_QM/ssl
gsk8capicmd -keydb -create -db $CUST_SSL_DIR/key.kdb -pw mli123 -type cms -expire 365 -stash -fips 
gsk8capicmd -cert -create -db $CUST_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqmli_cust_qm -dn "cn=linux02.isphereglobal.com" -size 1024 -x509version 3 -sig_alg SHA1WithRSA -expire 365
gsk8capicmd -cert -extract -db $CUST_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqmli_cust_qm -target $CUST_SSL_DIR/mlicustqmCA -format ascii

###---MLI_CARD_QM---###
export CARD_SSL_DIR=$qmgr/MLI_CARD_QM/ssl
gsk8capicmd -keydb -create -db $CARD_SSL_DIR/key.kdb -pw mli123 -type cms -expire 365 -stash -fips 
gsk8capicmd -cert -create -db $CARD_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqmli_card_qm -dn "cn=linux02.isphereglobal.com" -size 1024 -x509version 3 -sig_alg SHA1WithRSA -expire 365
gsk8capicmd -cert -extract -db $CARD_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqmli_card_qm -target $CARD_SSL_DIR/mlicardqmCA -format ascii

###---MLI_TXN_QM---###
export TXN_SSL_DIR=$qmgr/MLI_TXN_QM/ssl
gsk8capicmd -keydb -create -db $TXN_SSL_DIR/key.kdb -pw mli123 -type cms -expire 365 -stash -fips 
gsk8capicmd -cert -create -db $TXN_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqmli_txn_qm -dn "cn=linux02.isphereglobal.com" -size 1024 -x509version 3 -sig_alg SHA1WithRSA -expire 365
gsk8capicmd -cert -extract -db $TXN_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqmli_txn_qm -target $TXN_SSL_DIR/mlitxnqmCA -format ascii

###---MLI_REWARD_QM---###
export REWARD_SSL_DIR=$qmgr/MLI_REWARD_QM/ssl
gsk8capicmd -keydb -create -db $REWARD_SSL_DIR/key.kdb -pw mli123 -type cms -expire 365 -stash -fips 
gsk8capicmd -cert -create -db $REWARD_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqmli_reward_qm -dn "cn=linux02.isphereglobal.com" -size 1024 -x509version 3 -sig_alg SHA1WithRSA -expire 365
gsk8capicmd -cert -extract -db $REWARD_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqmli_reward_qm -target $REWARD_SSL_DIR/mlirewardqmCA -format ascii

###---MLI_APP_QM---###
export APP_SSL_DIR=$qmgr/MLI_APP_QM/ssl
gsk8capicmd -keydb -create -db $APP_SSL_DIR/key.kdb -pw mli123 -type cms -expire 365 -stash -fips 
gsk8capicmd -cert -create -db $APP_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqmli_app_qm -dn "cn=linux02.isphereglobal.com" -size 1024 -x509version 3 -sig_alg SHA1WithRSA -expire 365
gsk8capicmd -cert -extract -db $APP_SSL_DIR/key.kdb -pw mli123 -label ibmwebspheremqmli_app_qm -target $APP_SSL_DIR/mliappqmCA -format ascii





