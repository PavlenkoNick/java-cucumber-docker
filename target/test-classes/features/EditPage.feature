Feature: EditPage feature
  This feature tests interactions with different types of input fields on the EditPage

  Background:
    Given A user navigates to the home page
    And Clicks to the "Edit" link

  Scenario Outline: Verify it is possible to enter a text in the "<Field name>" input field
    When Enters "<Full name>" into the "<Field name>" input field
    Then "<Full name>" is presented in the "<Field name>" input field

    Examples:
      | Field name             | Full name |
      | Enter your full Name | John Doe  |

  Scenario Outline: Verify it is possible to append a text in the "<Field name>" input field
    When Appends a text "<Text to append>" into the "<Field name>" input field
    Then "<Text to append>" is presented in the "<Field name>" input field

    Examples:
      | Field name                           | Text to append                                       |
      | Append a text and press keyboard tab | Some text with numbers 123 and characters !@#$%^&*() |

  Scenario Outline: Verify it is possible to print out the content of the "<Field name>" input field
    Then The content of the "<Field name>" input field is printed out

    Examples:
      | Field name                  |
      | What is inside the text box |

  Scenario Outline: Verify it is possible to clear a text in the "<Field name>" input field
    When Clears a text in the "<Field name>" input field
    Then "" is in the "<Field name>" input field

    Examples:
      | Field name     |
      | Clear the text |

  Scenario Outline: Verify the edit field "<Field name>" is disabled
    Then Input field "<Field name>" is disabled

    Examples:
      | Field name                     |
      | Confirm edit field is disabled |

  Scenario Outline: Verify the edit field "<Field name>" is readonly
    Then Edit field "<Field name>" is readonly

    Examples:
      | Field name               |
      | Confirm text is readonly |