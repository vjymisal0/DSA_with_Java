#include <stdio.h>
#include <string.h>

#define MAX_PRODUCTS 100

struct Product
{
    int productID;
    char productName[50];
    float price;
    int quantity;
};

void addRecord(struct Product inventory[], int *numProducts)
{
    if (*numProducts < MAX_PRODUCTS)
    {
        struct Product newProduct;
        printf("Enter product ID: ");
        scanf("%d", &newProduct.productID);
        printf("Enter product name: ");
        scanf("%s", newProduct.productName);
        printf("Enter price: ");
        scanf("%f", &newProduct.price);
        printf("Enter quantity: ");
        scanf("%d", &newProduct.quantity);

        inventory[*numProducts] = newProduct;
        (*numProducts)++; // Increment the number of products

        printf("Record added successfully!\n");
    }
    else
    {
        printf("Error: Database full. Cannot add more records.\n");
    }
}

void displayDatabase(struct Product inventory[], int numProducts)
{
    if (numProducts == 0)
    {
        printf("Database is empty.\n");
        return;
    }

    printf("Product ID\tProduct Name\tPrice\tQuantity\n");
    for (int i = 0; i < numProducts; i++)
    {
        printf("%d\t\t%s\t\t%.2f\t%d\n", inventory[i].productID, inventory[i].productName,
               inventory[i].price, inventory[i].quantity);
    }
}

int searchRecord(struct Product inventory[], int numProducts, int searchID)
{
    for (int i = 0; i < numProducts; i++)
    {
        if (inventory[i].productID == searchID)
        {
            return i;
        }
    }
    return -1; // jop
}

// Function to delete a record
void deleteRecord(struct Product inventory[], int *numProducts, int deleteID)
{
    int index = searchRecord(inventory, *numProducts, deleteID);
    if (index != -1)
    {
        // Shift records to fill the gap
        for (int i = index; i < (*numProducts - 1); i++)
        {
            inventory[i] = inventory[i + 1];
        }
        (*numProducts)--;
        printf("Record deleted successfully!\n");
    }
    else
    {
        printf("Error: Record not found.\n");
    }
}

// Function to update records
void updateRecord(struct Product inventory[], int numProducts, int updateID)
{
    int index = searchRecord(inventory, numProducts, updateID);
    if (index != -1)
    {
        printf("Enter new product name: ");
        scanf("%s", inventory[index].productName);
        printf("Enter new price: ");
        scanf("%f", &inventory[index].price);
        printf("Enter new quantity: ");
        scanf("%d", &inventory[index].quantity);
        printf("Record updated successfully!\n");
    }
    else
    {
        printf("Error: Record not found.\n");
    }
}

// Function to perform bubble sort on records based on product ID
void sortRecords(struct Product inventory[], int numProducts)
{
    for (int i = 0; i < numProducts - 1; i++)
    {
        for (int j = 0; j < numProducts - i - 1; j++)
        {
            if (inventory[j].productID > inventory[j + 1].productID)
            {
                // Swap the records
                struct Product temp = inventory[j];
                inventory[j] = inventory[j + 1];
                inventory[j + 1] = temp;
            }
        }
    }
    printf("Records sorted successfully!\n");
}

int main()
{
    struct Product inventory[MAX_PRODUCTS];
    int numProducts = 0;

    int choice, searchID, deleteID, updateID;

    do
    {
        printf("\n===== Inventory System Menu =====\n");
        printf("1. Add Record\n");
        printf("2. Display Database\n");
        printf("3. Search Record\n");
        printf("4. Delete Record\n");
        printf("5. Update Record\n");
        printf("6. Sort Records\n");
        printf("7. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            addRecord(inventory, &numProducts);
            break;
        case 2:
            displayDatabase(inventory, numProducts);
            break;
        case 3:
            printf("Enter product ID to search: ");
            scanf("%d", &searchID);
            int searchIndex = searchRecord(inventory, numProducts, searchID);
            if (searchIndex != -1)
            {
                printf("Record found at index %d.\n", searchIndex);
            }
            else
            {
                printf("Record not found.\n");
            }
            break;
        case 4:
            printf("Enter product ID to delete: ");
            scanf("%d", &deleteID);
            deleteRecord(inventory, &numProducts, deleteID);
            break;
        case 5:
            printf("Enter product ID to update: ");
            scanf("%d", &updateID);
            updateRecord(inventory, numProducts, updateID);
            break;
        case 6:
            sortRecords(inventory, numProducts);
            break;
        case 7:
            printf("Exiting the program.\n");
            break;
        default:
            printf("Invalid choice. Please enter a valid option.\n");
        }

    } while (choice != 7);

    return 0;
}
