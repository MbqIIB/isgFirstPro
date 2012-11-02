#!/bin/bash

/opt/mqm/bin/crtmqm -q WIN_MLI_REWARD_QM
/opt/mqm/bin/strmqm WIN_MLI_REWARD_QM
/opt/mqm/bin/runmqsc < mliRewardQmgr.in
