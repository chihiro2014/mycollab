/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.module.project.domain.criteria;

import java.util.Arrays;

import com.esofthead.mycollab.core.arguments.NumberSearchField;
import com.esofthead.mycollab.core.arguments.SearchCriteria;
import com.esofthead.mycollab.core.arguments.StringSearchField;
import com.esofthead.mycollab.core.db.query.DateParam;
import com.esofthead.mycollab.core.db.query.Param;
import com.esofthead.mycollab.core.db.query.PropertyListParam;
import com.esofthead.mycollab.core.db.query.StringListParam;

/**
 * 
 * @author MyCollab Ltd.
 * @since 1.0
 * 
 */
public class RiskSearchCriteria extends SearchCriteria {
	private static final long serialVersionUID = 1L;

	public static Param p_assignee = new PropertyListParam("risk-assignuser",
			"Assignee", "m_prj_risk", "assigntouser");

	public static Param p_raisedUser = new PropertyListParam("risk-raiseduser",
			"Raised By", "m_prj_risk", "raisedbyuser");

	public static Param p_duedate = new DateParam("risk-duedate", "Due Date",
			"m_prj_risk", "datedue");

	public static Param p_raiseddate = new DateParam("risk-raiseddate",
			"Raised Date", "m_prj_risk", "dateraised");

	public static Param p_status = new StringListParam("risk-status", "Status",
			"m_prj_risk", "status", Arrays.asList("Open", "Closed"));

	public static Param p_probalitity = new StringListParam("risk-probalitity",
			"Probability", "m_prj_risk", "probalitity", Arrays.asList(
					"Certain", "Likely", "Possible", "Unlikely", "Rare"));

	public static Param p_consequence = new StringListParam("risk-consequence",
			"Consequence", "m_prj_risk", "consequence", Arrays.asList(
					"Catastrophic", "Critical", "Marginal", "Negligible"));

	public static Param p_createdtime = new DateParam("risk-createdtime",
			"Created Time", "m_prj_risk", "createdTime");

	public static Param p_lastupdatedtime = new DateParam(
			"risk-lastupdatedtime", "Last Updated Time", "m_prj_risk",
			"lastUpdatedTime");

	private StringSearchField riskname;

	private StringSearchField raisedByUser;

	private StringSearchField assignToUser;

	private NumberSearchField projectId;

	private NumberSearchField id;

	public StringSearchField getRiskname() {
		return riskname;
	}

	public void setRiskname(StringSearchField riskname) {
		this.riskname = riskname;
	}

	public NumberSearchField getProjectId() {
		return projectId;
	}

	public void setProjectId(NumberSearchField projectId) {
		this.projectId = projectId;
	}

	public StringSearchField getRaisedByUser() {
		return raisedByUser;
	}

	public void setRaisedByUser(StringSearchField raisedByUser) {
		this.raisedByUser = raisedByUser;
	}

	public StringSearchField getAssignToUser() {
		return assignToUser;
	}

	public void setAssignToUser(StringSearchField assignToUser) {
		this.assignToUser = assignToUser;
	}

	public void setId(NumberSearchField id) {
		this.id = id;
	}

	public NumberSearchField getId() {
		return id;
	}
}
