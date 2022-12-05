package ru.alfabank.atlassian.optionmanager.webwork;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.atlassian.jira.web.action.JiraWebActionSupport;


public class OptionManagerWebworkAction extends JiraWebActionSupport {
    private static final Logger log = LoggerFactory.getLogger(OptionManagerWebworkAction.class);

    /*@Override
    public String execute() throws Exception {

        return "option-manager-success";
    }*/

    @Override
    protected String doExecute() throws Exception {
        return super.doExecute();
    }

    @Override
    public String doDefault() throws Exception {
        return SUCCESS;
    }

}
