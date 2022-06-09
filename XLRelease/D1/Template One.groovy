// Exported from:        http://LAPTOP-9C20LTLG:5517/#/templates/Folderb5dfc361d100492ba15609fae88611ec-Releaseea870f824b7f40b9b25a92fc9648fab4/code
// Release version:      22.0.2
// Date created:         Thu Jun 09 17:20:42 IST 2022

xlr {
  template('Template One') {
    folder('D1')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-06-09T09:00:00+0530')
    dueDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-06-09T10:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}mHKJzQ8z4iWRQoFU+A696J2oO3J5rANouhb/1r1MuGc='
    phases {
      phase('New Phase') {
        tasks {
          manual('MT1') {
            
          }
        }
      }
    }
    
  }
}