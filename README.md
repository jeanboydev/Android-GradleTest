## Gradle 生命周期

### 初始化阶段

解析整个工程中所有的 Project，构建所有的 Project 对应的 Project 对象。

### 配置阶段

解析所有的 Project 对象中的 Task，构建好所有的 Task 的拓扑图

### 执行阶段

执行具体的 Task 及其依赖 Task。


## 常用命令

> $ ./gradlew clean

> $ ./gradlew build

> $ ./gradlew projects