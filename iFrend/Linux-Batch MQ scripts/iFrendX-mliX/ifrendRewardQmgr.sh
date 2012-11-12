#!/bin/bash

/opt/mqm/bin/crtmqm -q REWARD_QM
/opt/mqm/bin/strmqm REWARD_QM
/opt/mqm/bin/runmqsc < iFrendRewardQmgr.in
