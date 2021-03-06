package org.toba.psd.model;

/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/


import java.math.BigDecimal;
import java.sql.Timestamp;

import org.compiere.model.MTable;
import org.compiere.util.KeyNamePair;
import org.taowi.hcm.core.model.I_HC_Employee;

/** Generated Interface for HC_LeaveRequest_Adm
 *  @author iDempiere (generated) 
 *  @version Release 4.1
 */
public interface I_HC_LeaveRequest_Adm 
{

    /** TableName=HC_LeaveRequest_Adm */
    public static final String Table_Name = "HC_LeaveRequest_Adm";

    /** AD_Table_ID=1000134 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name HC_Employee_ID */
    public static final String COLUMNNAME_HC_Employee_ID = "HC_Employee_ID";

	/** Set Employee Data	  */
	public void setHC_Employee_ID (int HC_Employee_ID);

	/** Get Employee Data	  */
	public int getHC_Employee_ID();

	public I_HC_Employee getHC_Employee() throws RuntimeException;

    /** Column name HC_LeaveEndDate */
    public static final String COLUMNNAME_HC_LeaveEndDate = "HC_LeaveEndDate";

	/** Set Leave End Date	  */
	public void setHC_LeaveEndDate (Timestamp HC_LeaveEndDate);

	/** Get Leave End Date	  */
	public Timestamp getHC_LeaveEndDate();

    /** Column name HC_LeaveRequest_Adm_ID */
    public static final String COLUMNNAME_HC_LeaveRequest_Adm_ID = "HC_LeaveRequest_Adm_ID";

	/** Set Request Leave Admin	  */
	public void setHC_LeaveRequest_Adm_ID (int HC_LeaveRequest_Adm_ID);

	/** Get Request Leave Admin	  */
	public int getHC_LeaveRequest_Adm_ID();

    /** Column name HC_LeaveRequest_Adm_UU */
    public static final String COLUMNNAME_HC_LeaveRequest_Adm_UU = "HC_LeaveRequest_Adm_UU";

	/** Set HC_LeaveRequest_Adm_UU	  */
	public void setHC_LeaveRequest_Adm_UU (String HC_LeaveRequest_Adm_UU);

	/** Get HC_LeaveRequest_Adm_UU	  */
	public String getHC_LeaveRequest_Adm_UU();

    /** Column name HC_LeaveStartDate */
    public static final String COLUMNNAME_HC_LeaveStartDate = "HC_LeaveStartDate";

	/** Set Leave Start Date	  */
	public void setHC_LeaveStartDate (Timestamp HC_LeaveStartDate);

	/** Get Leave Start Date	  */
	public Timestamp getHC_LeaveStartDate();

    /** Column name HC_LeaveType_ID */
    public static final String COLUMNNAME_HC_LeaveType_ID = "HC_LeaveType_ID";

	/** Set Leave Type	  */
	public void setHC_LeaveType_ID (int HC_LeaveType_ID);

	/** Get Leave Type	  */
	public int getHC_LeaveType_ID();

	public I_HC_LeaveType getHC_LeaveType() throws RuntimeException;

    /** Column name HC_NonBusinessDay */
    public static final String COLUMNNAME_HC_NonBusinessDay = "HC_NonBusinessDay";

	/** Set Non Business Day	  */
	public void setHC_NonBusinessDay (int HC_NonBusinessDay);

	/** Get Non Business Day	  */
	public int getHC_NonBusinessDay();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name LeaveDays */
    public static final String COLUMNNAME_LeaveDays = "LeaveDays";

	/** Set Leave Days	  */
	public void setLeaveDays (int LeaveDays);

	/** Get Leave Days	  */
	public int getLeaveDays();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();
}
