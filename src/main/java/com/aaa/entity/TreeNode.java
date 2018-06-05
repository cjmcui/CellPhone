package com.aaa.entity;

import java.util.List;
import java.util.Map;

public class TreeNode {

	private Integer id;// �󶨽ڵ�ı�ʶֵ��
	private String text;// ��ʾ�Ľڵ��ı���
	private String iconCls;// ��ʾ�Ľڵ�ͼ��CSS��ID
	private String state;// �ڵ�״̬��'open' �� 'closed'
	private Map<String, String> attributes;// �󶨸ýڵ���Զ������ԡ�
	private List<TreeNode> children;// �ӽڵ�

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	public List<TreeNode> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "TreeNode [id=" + id + ", text=" + text + ", iconCls=" + iconCls
				+ ", state=" + state + ", attributes=" + attributes
				+ ", children=" + children + "]";
	}

}
