// Exported from:        http://LAPTOP-9C20LTLG:5516/#/templates/Folder360f71469e5749bbb4c12070e0d923ec-Release83168cad2b85449794cf9de5ff38d674/code
// Release version:      22.0.0-20211220-123974
// Date created:         Thu May 26 11:57:34 IST 2022

xlr {
  template('CT') {
    folder('D-20595')
    variables {
      stringVariable('deliveryID') {
        required false
        showOnReleaseStart false
      }
      stringVariable('FolderName') {
        required false
        showOnReleaseStart false
        value 'D-20595_1_1'
      }
      stringVariable('DeliveryId2') {
        required false
        showOnReleaseStart false
      }
    }
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-05-24T09:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}Xs0KduY3gglyC1HcML5mBGXBbhyPkpyzQeymVogniXQ='
    phases {
      phase('New Phase') {
        tasks {
          custom('CD') {
            script {
              type 'delivery.CreateDelivery'
              iconClass 'rocket'
              pattern 'D-20595/PP1'
              folder 'D-20595_1'
              title 'CD_2'
              deliveryId variable('deliveryID')
            }
          }
          custom('FCD') {
            script {
              type 'delivery.FindOrCreateDelivery'
              iconClass 'rocket'
              pattern 'D-20595/P12'
              folder '${folder.DeliveryFolderName}'
              fallback true
              title 'FCD'
              deliveryId variable('DeliveryId2')
            }
          }
        }
      }
    }
    
  }
}