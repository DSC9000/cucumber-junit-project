Feature:  Cucumber Data Tables implementation practices pets

  Scenario: List of types of pets we love
    Then user should see the pets we love
    |Guppy|
    |Electric Blue Acara|
    |Cory|
    |Parrot Fish|
    |Australian Rainbow Fish|
    |Knife  Fish|
    |Convict Cichlid|
    |Boesemani Rainbow|
    |Kuhli Loach |
@wip
    Scenario: Officer reads data about driver
      Then officer is able to see any data about driver
      |name|Jane|
      |surname|Doe|
      |age|29|
      |address|somewhere|
      |state|CA|
      |zipcode|999999|
      |phone|111-111-1111|
