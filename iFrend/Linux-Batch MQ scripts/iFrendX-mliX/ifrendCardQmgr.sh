#!/bin/bash

/opt/mqm/bin/crtmqm -q CARD_QM
/opt/mqm/bin/strmqm CARD_QM
/opt/mqm/bin/runmqsc < ifrendCardQmgr.in
