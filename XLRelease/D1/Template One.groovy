// Exported from:        http://LAPTOP-9C20LTLG:5516/#/templates/Folder61f164c9347544038cc8466685b62ce9-Release55f475723d354a52b60d5f7b261c9801/code
// Release version:      22.0.0-20211220-123974
// Date created:         Thu Jun 09 19:51:14 IST 2022

xlr {
  template('Template One') {
    folder('D1')
    variables {
      passwordVariable('Test') {
        label 'admin'
        value '{aes:v0}m358hIW2AQb8Yrn/MsMmKFVksaVoPTjOmGSUXMgNYNQ='
      }
    }
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-06-09T09:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}0N4goykgAdBzGWXpjIip4Pdc3oIiMWA6+MtmJ7d4+k0='
    phases {
      phase('New Phase') {
        tasks {
          manual('D') {
            
          }
          manual('DD') {
            
          }
        }
      }
    }
    
  }
}