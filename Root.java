package com.ping.admin.api.selectormodel;

public class Root {
	public String id;
	public String name;
	public PluginDescriptorRef pluginDescriptorRef;
	public Configuration configuration;
	public AttributeContract attributeContract;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PluginDescriptorRef getPluginDescriptorRef() {
		return pluginDescriptorRef;
	}
	public void setPluginDescriptorRef(PluginDescriptorRef pluginDescriptorRef) {
		this.pluginDescriptorRef = pluginDescriptorRef;
	}
	public Configuration getConfiguration() {
		return configuration;
	}
	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}
	
	public AttributeContract getAttributeContract() {
		return attributeContract;
	}
	public void setAttributeContract(AttributeContract attributeContract) {
		this.attributeContract = attributeContract;
	}
	
	public Root(String id, String name, PluginDescriptorRef pluginDescriptorRef, Configuration configuration,
			AttributeContract attributeContract) {
		super();
		this.id = id;
		this.name = name;
		this.pluginDescriptorRef = pluginDescriptorRef;
		this.configuration = configuration;
		this.attributeContract = attributeContract;
	}
	public Root() {
		super();
	}
	
	
}
