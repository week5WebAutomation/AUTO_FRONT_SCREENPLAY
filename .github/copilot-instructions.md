# GitHub Copilot Instructions for AUTO_FRONT_SCREENPLAY

## Overview
This document provides guidelines for using GitHub Copilot effectively in the AUTO_FRONT_SCREENPLAY project. The project follows the Screenplay pattern and uses Serenity BDD for automation testing. These instructions aim to ensure that Copilot-generated code aligns with the project's conventions and best practices.

## Project-Specific Conventions

### General Rules
- **No Comments in Code**: Avoid adding comments in the code. The code should be self-explanatory.
- **Clean Code**: Ensure that the code is clean and adheres to best practices.
- **Single Responsibility Principle**: Each class or method should have a single responsibility.

### Gherkin Scenarios
- Use Gherkin syntax for writing scenarios.
- Scenarios should be written in English using keywords: `Feature`, `Scenario`, `Given`, `When`, `Then`, `And`, `But`.

### Screenplay Pattern
- Follow the Screenplay pattern, which includes:
  - **Actors**: Represent the users interacting with the system.
  - **Tasks**: High-level actions performed by actors.
  - **Actions**: Low-level interactions with the system.
  - **Questions**: Assertions or verifications.

### Framework and Tools
- **IDE**: Use VSCode with GitHub Copilot enabled.
- **Dependency Management**: Use Gradle for managing dependencies.
- **Test Runner**: Use Serenity BDD for running tests.

## Copilot Usage Guidelines

### Generating Code
- Use Copilot to generate boilerplate code for Actors, Tasks, Actions, and Questions.
- Ensure that generated code adheres to the Screenplay pattern and project conventions.

### Reviewing Suggestions
- Carefully review Copilot's suggestions to ensure they align with the project's rules and patterns.
- Avoid accepting suggestions that introduce comments or violate the single responsibility principle.

### Example Prompts
- "Generate a Task for logging into the application."
- "Create an Action for clicking a button."
- "Write a Question to verify the success message."

## Potential Pitfalls
- **Non-Adherence to Patterns**: Ensure that Copilot suggestions do not deviate from the Screenplay pattern.
- **Verbose or Unnecessary Code**: Avoid accepting suggestions that introduce unnecessary complexity.

## Feedback and Iteration
- Regularly review and update these instructions based on team feedback and evolving project requirements.
- Encourage team members to share their experiences with Copilot to improve its effectiveness in the project.

---

By following these instructions, the team can leverage GitHub Copilot to enhance productivity while maintaining high code quality and adherence to project conventions.