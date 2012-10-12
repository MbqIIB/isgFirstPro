/**
 * 
 */
package com.isg.ifrend.core.controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Window;

/**
 * @author gerald.deguzman
 *
 */
@SuppressWarnings("rawtypes")
public class Div_headerViewCtrl extends GenericForwardComposer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*private Div div_header;*/

	
	@SuppressWarnings("unchecked")
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		// TODO Auto-generated method stub

	}

	public void onClick$tbarNewMemo() throws InterruptedException{
		Window window = (Window)Executions.createComponents(
                "/pages/memos/new_memo.zul", null, null);
        window.doModal();
	}
	
	public void onClick$tbarEndCall() throws InterruptedException{
		Window window = (Window)Executions.createComponents(
                "/pages/end_call.zul", null, null);
        window.doModal();
	}
	
	public void onClick$tbarCallHistory() throws InterruptedException{
		Window window = (Window)Executions.createComponents(
                "/pages/call_history.zul", null, null);
        window.doModal();
	}
	public void onClick$tbarNotes() throws InterruptedException{
		Window window = (Window)Executions.createComponents(
                "/pages/notes/notes_history.zul", null, null);
        window.doModal();
	}
	
	public void onClick$tbarMemo() throws InterruptedException{
		Window window = (Window)Executions.createComponents(
                "/pages/memos/memo_history.zul", null, null);
        window.doModal();
	}
	
}
