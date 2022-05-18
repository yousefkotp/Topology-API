# Topology-API
A simple API to access, manage and store device topologies in JSON formatted file.
## Table of Content
- [Topology-API](#topology-api)
  * [API Functionalities](#api-functionalities)
  * [Tools](#tools)
  * [Why Java?](#why-java-)
  * [Dependencies](#dependencies)
  * [Deployment](#deployment)
  * [Design Patterns](#design-patterns)
    + [Code Snippet](#code-snippet)
  * [Code Analysis](#code-analysis)
  * [Testing](#testing)
  * [Usage](#usage)
  * [Author](#author)
## API Functionalities
1. Read and write topologies to and from disk.
2. Stores multiple topologies in memory.
3. Execute operations on topologies.

## Tools
1. Java
2. IntelliJ IDEA (IDE)
3. [GSON](https://github.com/google/gson) - JSON Parser
4. Maven (Building Tool)
5. [CodeMR](https://www.codemr.co.uk/) (Code Analysis Tool)
6. [JUnit](https://junit.org/junit5/) (Testing)
## Why Java?
1. Java **takes care of managed pointers** (smart pointers) on its own. Java Memory Model (JVM) handles memory management smartly including monitoring, garbage collection tuning and obvious memory management.
2. **Serialization and Deserialization** of JSON file is effortless using Java.
3. Since **Project is Object Oriented**, meaning that considering Topology and Components as objects would save us time and effort, Java would be the best programming language to write the project with
## Dependencies
Add the following Maven repository
> com.google.code.gson:gson:2.9.0
## Deployment
1. Run "Main" class as your main class.

2. If you need to create instance from the API, type the following: 
```Java
TopologyAPI api = TopologyAPI.createTopologyAPI();
```
## Design Patterns
**1. Singleton Design Pattern**

Since we only need one instance of the API, the Singleton Design Pattern is applied in "TopologyAPI" class.
### Code Snippet
```Java
    private static TopologyAPI api=null;
    private final ArrayList<Topology>topologies;
    
    private TopologyAPI() {
        topologies = new ArrayList<>();
    }
    public static TopologyAPI createTopologyAPI(){
        if(api==null)
            api= new TopologyAPI();
        return api;
    }
```
## Code Analysis
![image](https://user-images.githubusercontent.com/41492875/168929786-a43fe717-6636-4aa6-8efb-2cb66f287aaa.png)

## Testing

## Usage
1. Read a topology from JSON file.
```Java
Topology t1 = api.readJSON("topology.json");
```
2. Write topology into JSON file and removing it from API's memory. The function returns false if there is no topology with given ID.
```Java
api.writeJSON("top1");
```   
3. Query all the topologies in the API's memory.

```Java
ArrayList<Topology> topologies = api.queryTopologies();
```   
4. Delete a given topology from API's memory. The function returns false if there is no such topology
```Java
api.deleteTopology("top1");
```   
5. Query the devices within a given topology.
```Java
ArrayList<Component> components = api.queryDevices("top1");
```       
6. Query Devices for a given topology and component IDs.
```Java
ArrayList<Component> component = api.queryDevicesWithNetlistNode("top1","res1");
``` 
      
## Author
[Yousef Kotp](https://github.com/yousefkotp)
