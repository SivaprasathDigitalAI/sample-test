// Exported from:        http://LAPTOP-9C20LTLG:5516/#/templates/Folderc7e178190a1840b78f18aab0edb6b2de-Releasedd211bef3c744ab1919f8efcf4cadafb/code
// Release version:      10.2.0-20210603-123974
// Date created:         Tue Nov 16 07:36:29 EST 2021

xlr {
  template('FI-914 Template') {
    folder('FI-914')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2021-11-15T22:30:00-0500')
    phases {
      phase('Dummy Phase') {
        color '#3D6C9E'
        tasks {
          manual('Manual Task') {
            
          }
          userInput('Test') {
            description 'Please enter the required information below.'
            variables {
              
            }
          }
          manual('Test Add') {
            
          }
        }
      }
    }
    
  }
}