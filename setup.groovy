stash includes: '*.groovy', name: 'assets', useDefaultExcludes: false

checkout scm

unstash 'assets'

gitUrl = sh (
  script: "git config --get remote.origin.url",
  returnStdout: true
).trim()

gitRepo = sh (
  script: "basename -s .git `git config --get remote.origin.url`",
  returnStdout: true
).trim()

gitCommit = sh (
  script: "git log -1 --pretty=format:%H",
  returnStdout: true
).trim()
