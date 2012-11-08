#!/bin/bash

/opt/mqm/bin/crtmqm -q Reward_QM
/opt/mqm/bin/strmqm Reward_QM
/opt/mqm/bin/runmqsc < ifrendRewardQmgr.in
