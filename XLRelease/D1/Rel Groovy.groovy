// Exported from:        http://LAPTOP-9C20LTLG:5516/#/templates/Folder61f164c9347544038cc8466685b62ce9-Releasebc68e22b2b8c4aa18f243393b5023486/code
// Release version:      22.0.0-20211220-123974
// Date created:         Thu Jun 16 10:52:35 IST 2022

xlr {
  template('Rel Groovy') {
    folder('D1')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-06-10T09:00:00+0530')
    dueDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-06-10T10:00:00+0530')
    phases {
      phase('New Phase') {
        tasks {
          groovyScript('ST') {
            ignoreScriptVariableInterpolation true
            script (['''\
xlr {
  release('Template One') {
    folder('D1')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-06-10T09:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}CBENOzHl9LZgYsQT96aZxFu3QDVwHD79M9wmyPY1Y90='
    phases {
      phase('New Phase') {
        tasks {
          manual('MMt') {

          }
        }
      }
    }

  }
}
'''])
          }
        }
      }
    }
    
  }
}