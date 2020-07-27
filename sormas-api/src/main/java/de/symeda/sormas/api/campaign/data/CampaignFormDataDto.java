/*
 * ******************************************************************************
 * * SORMAS® - Surveillance Outbreak Response Management & Analysis System
 * * Copyright © 2016-2020 Helmholtz-Zentrum für Infektionsforschung GmbH (HZI)
 * *
 * * This program is free software: you can redistribute it and/or modify
 * * it under the terms of the GNU General Public License as published by
 * * the Free Software Foundation, either version 3 of the License, or
 * * (at your option) any later version.
 * *
 * * This program is distributed in the hope that it will be useful,
 * * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * * GNU General Public License for more details.
 * *
 * * You should have received a copy of the GNU General Public License
 * * along with this program. If not, see <https://www.gnu.org/licenses/>.
 * ******************************************************************************
 */

package de.symeda.sormas.api.campaign.data;

import de.symeda.sormas.api.EntityDto;
import de.symeda.sormas.api.campaign.CampaignReferenceDto;
import de.symeda.sormas.api.campaign.form.CampaignFormReferenceDto;
import de.symeda.sormas.api.region.CommunityReferenceDto;
import de.symeda.sormas.api.region.DistrictReferenceDto;
import de.symeda.sormas.api.region.RegionReferenceDto;
import de.symeda.sormas.api.user.UserReferenceDto;
import de.symeda.sormas.api.utils.DataHelper;

import java.util.Date;
import java.util.List;

public class CampaignFormDataDto extends EntityDto {

	private static final long serialVersionUID = -8087195060395038093L;

	public static final String I18N_PREFIX = "CampaignFormData";

	public static final String CAMPAIGN = "campaign";
	public static final String CAMPAIGN_FORM = "campaignForm";
	public static final String FORM_DATE = "formDate";
	public static final String REGION = "region";
	public static final String DISTRICT = "district";
	public static final String COMMUNITY = "community";

	private List<CampaignFormValue> formValues;
	private CampaignReferenceDto campaign;
	private CampaignFormReferenceDto campaignForm;
	private Date formDate;
	private RegionReferenceDto region;
	private DistrictReferenceDto district;
	private CommunityReferenceDto community;
	private UserReferenceDto creatingUser;

	public static CampaignFormDataDto build(
		CampaignReferenceDto campaign,
		CampaignFormReferenceDto campaignForm,
		RegionReferenceDto region,
		DistrictReferenceDto district,
		CommunityReferenceDto community) {
		CampaignFormDataDto campaignFormData = new CampaignFormDataDto();
		campaignFormData.setUuid(DataHelper.createUuid());
		campaignFormData.setCampaign(campaign);
		campaignFormData.setCampaignForm(campaignForm);
		campaignFormData.setRegion(region);
		campaignFormData.setDistrict(district);
		campaignFormData.setCommunity(community);
		campaignFormData.setFormDate(new Date());
		return campaignFormData;
	}

	public List<CampaignFormValue> getFormValues() {
		return formValues;
	}

	public void setFormValues(List<CampaignFormValue> formValues) {
		this.formValues = formValues;
	}

	public CampaignFormReferenceDto getCampaignForm() {
		return campaignForm;
	}

	public void setCampaignForm(CampaignFormReferenceDto campaignForm) {
		this.campaignForm = campaignForm;
	}

	public CampaignReferenceDto getCampaign() {
		return campaign;
	}

	public void setCampaign(CampaignReferenceDto campaign) {
		this.campaign = campaign;
	}

	public Date getFormDate() {
		return formDate;
	}

	public void setFormDate(Date formDate) {
		this.formDate = formDate;
	}

	public RegionReferenceDto getRegion() {
		return region;
	}

	public void setRegion(RegionReferenceDto region) {
		this.region = region;
	}

	public DistrictReferenceDto getDistrict() {
		return district;
	}

	public void setDistrict(DistrictReferenceDto district) {
		this.district = district;
	}

	public CommunityReferenceDto getCommunity() {
		return community;
	}

	public void setCommunity(CommunityReferenceDto community) {
		this.community = community;
	}

	public UserReferenceDto getCreatingUser() {
		return creatingUser;
	}

	public void setCreatingUser(UserReferenceDto creatingUser) {
		this.creatingUser = creatingUser;
	}
}
