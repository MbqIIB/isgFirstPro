#!/bin/bash

/opt/mqm/bin/crtmqm -q ACCNT_QM
/opt/mqm/bin/strmqm ACCNT_QM
/opt/mqm/bin/runmqsc < ifrendAccntQmgr.in
