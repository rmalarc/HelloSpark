# Getting Started with Spark and IntelliJ

1. Download and install IntelliJ from https://www.jetbrains.com/idea/
2. Install the Scala plugin
3. Download and Install the JDK 8
4. Import project from existing sources, select from external model | SBT
5. Once the project opens up, create a configuration from RUN | CREATE CONFIGURATION, add a "Scala Console", from the "use classpath and SDK of module" select "helloSpark"
6. You can press the play button to compile and launch the console.
7. Within the console, run:

```
HelloSpark.wordCounts
```

and press CTRL-ENTER (Windows), COMMAND-ENTER (Mac) to execute