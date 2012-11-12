#!/bin/sh

export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:/opt/mqm/gskit8/lib;
export PATH=$PATH:/opt/mqm/gskit8/bin;
qmgr=/var/mqm/qmgrs;

export ACCNT_SSL_DIR=$qmgr/MLI_ACCNT_QM/ssl
gsk8capicmd -cert -add -db $ACCNT_SSL_DIR/key.kdb -pw mli123 -label accntqmCA -file $ACCNT_SSL_DIR/accntqmCA -format ascii -fips

export CUST_SSL_DIR=$qmgr/MLI_CUST_QM/ssl
gsk8capicmd -cert -add -db $CUST_SSL_DIR/key.kdb -pw mli123 -label custqmCA -file $CUST_SSL_DIR/custqmCA -format ascii -fips

export CARD_SSL_DIR=$qmgr/MLI_CARD_QM/ssl
gsk8capicmd -cert -add -db $CARD_SSL_DIR/key.kdb -pw mli123 -label cardqmCA -file $CARD_SSL_DIR/cardqmCA -format ascii -fips

export TXN_SSL_DIR=$qmgr/MLI_TXN_QM/ssl
gsk8capicmd -cert -add -db $TXN_SSL_DIR/key.kdb -pw mli123 -label txnqmCA -file $TXN_SSL_DIR/txnqmCA -format ascii -fips

export REWARD_SSL_DIR=$qmgr/MLI_REWARD_QM/ssl
gsk8capicmd -cert -add -db $REWARD_SSL_DIR/key.kdb -pw mli123 -label rewardqmCA -file $REWARD_SSL_DIR/rewardqmCA -format ascii -fips

export APP_SSL_DIR=$qmgr/MLI_APP_QM/ssl
gsk8capicmd -cert -add -db $APP_SSL_DIR/key.kdb -pw mli123 -label appqmCA -file $APP_SSL_DIR/appqmCA -format ascii -fips


