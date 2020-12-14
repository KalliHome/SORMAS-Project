package de.symeda.sormas.ui.labmessage;

import com.vaadin.ui.VerticalLayout;

import de.symeda.sormas.api.FacadeProvider;
import de.symeda.sormas.api.i18n.I18nProperties;
import de.symeda.sormas.api.i18n.Strings;
import de.symeda.sormas.api.labmessage.LabMessageDto;
import de.symeda.sormas.api.person.PersonDto;
import de.symeda.sormas.ui.utils.VaadinUiUtil;

public class LabMessageController {

	public LabMessageController() {

	}

	public void show(String uuid) {

		LabMessageDto newDto = FacadeProvider.getLabMessageFacade().getByUuid(uuid);

		LabMessageEditForm form = new LabMessageEditForm(true);
		form.setValue(newDto);
		VerticalLayout layout = new VerticalLayout(form);
		layout.setMargin(true);
		VaadinUiUtil.showPopupWindow(layout, I18nProperties.getString(Strings.headingShowLabMessage));
	}

	public void process(String uuid) {
		LabMessageDto dto = FacadeProvider.getLabMessageFacade().getByUuid(uuid);
		final PersonDto person = PersonDto.build();
		person.setFirstName(dto.getPersonFirstName());
		person.setLastName(dto.getPersonLastName());

//		ControllerProvider.getPersonController()
//			.selectOrCreatePerson(person, I18nProperties.getString(Strings.infoSelectOrCreatePersonForLabMessage), selectedPerson -> {
//				if (selectedPerson != null) {
//					CaseCriteria caseCriteria = new CaseCriteria();
//					EventParticipantCriteria eventParticipantCriteria = new EventParticipantCriteria();
//					eventParticipantCriteria.event(eventRef);
//					List<EventParticipantIndexDto> currentEventParticipants =
//						(List<EventParticipantIndexDto>) FacadeProvider.getEventParticipantFacade()
//							.getIndexList(eventParticipantCriteria, null, null, null);
//					Boolean alreadyParticipant = false;
//					for (EventParticipantIndexDto participant : currentEventParticipants) {
//						if (selectedPerson.getUuid().equals(participant.getPersonUuid())) {
//							alreadyParticipant = true;
//							break;
//						}
//					}
//					if (alreadyParticipant) {
//						throw new Validator.InvalidValueException(I18nProperties.getString(Strings.messageAlreadyEventParticipant));
//					} else {
//						dto.setPerson(FacadeProvider.getPersonFacade().getPersonByUuid(selectedPerson.getUuid()));
//						EventParticipantDto savedDto = eventParticipantFacade.saveEventParticipant(dto);
//						Notification.show(I18nProperties.getString(Strings.messageEventParticipantCreated), Notification.Type.ASSISTIVE_NOTIFICATION);
//						ControllerProvider.getEventParticipantController().createEventParticipant(savedDto.getUuid(), doneConsumer);
//					}
//				}
//			});
	}
}
