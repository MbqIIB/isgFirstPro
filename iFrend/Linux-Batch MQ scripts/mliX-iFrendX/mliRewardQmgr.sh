#!/bin/bash

/opt/mqm/bin/crtmqm -q MLI_REWARD_QM
/opt/mqm/bin/strmqm MLI_REWARD_QM
/opt/mqm/bin/runmqsc < mliRewardQmgr.in
