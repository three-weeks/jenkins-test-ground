build job: 'amkirsch/chef-pipeline/dev/cookbook-unit-tests',
  parameters: [string(name: 'GIT_URL', value: gitUrl),
               string(name: 'COOKBOOK', value: gitRepo),
               string(name: 'GIT_COMMIT', value: gitCommit),
               string(name: 'GIT_BRANCH', value: env.BRANCH_NAME)] 
