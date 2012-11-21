#!/bin/sh

export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:/opt/mqm/gskit8/lib;
export PATH=$PATH:/opt/mqm/gskit8/bin;
qmgr=/var/mqm/qmgrs;

export ACCNT_SSL_DIR=$qmgr/ACCNT_QM/ssl
gsk8capicmd -cert -add -db $ACCNT_SSL_DIR/key.kdb -pw mli123 -label mliaccntqmCA -file $ACCNT_SSL_DIR/mliaccntqmCA -format ascii -fips

export CUST_SSL_DIR=$qmgr/CUST_QM/ssl
gsk8capicmd -cert -add -db $CUST_SSL_DIR/key.kdb -pw mli123 -label mlicustqmCA -file $CUST_SSL_DIR/mlicustqmCA -format ascii -fips

export CARD_SSL_DIR=$qmgr/CARD_QM/ssl
gsk8capicmd -cert -add -db $CARD_SSL_DIR/key.kdb -pw mli123 -label mlicardqmCA -file $CARD_SSL_DIR/mlicardqmCA -format ascii -fips

export TXN_SSL_DIR=$qmgr/TXN_QM/ssl
gsk8capicmd -cert -add -db $TXN_SSL_DIR/key.kdb -pw mli123 -label mlitxnqmCA -file $TXN_SSL_DIR/mlitxnqmCA -format ascii -fips

export REWARD_SSL_DIR=$qmgr/REWARD_QM/ssl
gsk8capicmd -cert -add -db $REWARD_SSL_DIR/key.kdb -pw mli123 -label mlirewardqmCA -file $REWARD_SSL_DIR/mlirewardqmCA -format ascii -fips

export APP_SSL_DIR=$qmgr/APP_QM/ssl
gsk8capicmd -cert -add -db $APP_SSL_DIR/key.kdb -pw mli123 -label mliappqmCA -file $APP_SSL_DIR/mliappqmCA -format ascii -fips

export LETTER_SSL_DIR=$qmgr/LETTER_QM/ssl
gsk8capicmd -cert -add -db $LETTER_SSL_DIR/key.kdb -pw mli123 -label mliletterqmCA -file $LETTER_SSL_DIR/mliletterqmCA -format ascii -fips


