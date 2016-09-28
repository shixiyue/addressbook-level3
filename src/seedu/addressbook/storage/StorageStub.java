package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

/**
 * Represents the dummy file used to store address book data,
 * only for testing the Logic
 */
public class StorageStub extends Storage{
    
    public StorageStub() {
        
    }

    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {
        
    }

    @Override
    public AddressBook load() throws StorageOperationException {
        return null;
    }

    @Override
    public String getPath() {
        return null;
    }

}
