+----------------------------------+
|         ConfigurationManager     |
+----------------------------------+
| - instance: ConfigurationManager |
| - properties: Properties         |
+----------------------------------+
| + getInstance(): ConfigurationManager |
| + getProperty(key: String): String    |
| + setProperty(key: String, value: String) |
+----------------------------------+
            |
            |
        Extends
            |
            v
+----------------------------------+
| ConfigurationManagerException    |
+----------------------------------+
| + ConfigurationManagerException(message: String, cause: Throwable) |
+----------------------------------+
