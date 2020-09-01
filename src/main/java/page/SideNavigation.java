package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SideNavigation {
	
	WebDriver driver;

	// Every Page must have a constructor to invite the driver
	public SideNavigation(WebDriver driver) {
		this.driver = driver;
	}
	
	// Element Library
	
	@FindBy(how = How.XPATH, using = "//span[text()='Dashboard']")WebElement DashboardPage;
	@FindBy(how = How.XPATH, using = "//span[text()='Customers']")WebElement CustomersModule;
	@FindBy(how = How.LINK_TEXT, using = "Add Customer")WebElement AddCustomerPage;
	@FindBy(how = How.LINK_TEXT, using = "List Customers")WebElement ListCustomersPage;
	@FindBy(how = How.LINK_TEXT, using = "Groups")WebElement GroupsPage;
	@FindBy(how = How.XPATH, using = "//span[text()='Companies']")WebElement CompaniesPage;
	@FindBy(how = How.XPATH, using = "//span[text()='Transactions']")WebElement TransactionsModule;
	@FindBy(how = How.LINK_TEXT, using = "New Deposit")WebElement NewDepositPage;
	@FindBy(how = How.LINK_TEXT, using = "New Expense")WebElement NewExpensePage;
	@FindBy(how = How.LINK_TEXT, using = "Transfer")WebElement TransferPage;
	@FindBy(how = How.LINK_TEXT, using = "View Transactions")WebElement ViewTransactionsPage;
	@FindBy(how = How.LINK_TEXT, using = "Balance Sheet")WebElement BalanceSheetPage;
	@FindBy(how = How.XPATH, using = "//span[text()='Sales']")WebElement SalesModule;
	@FindBy(how = How.LINK_TEXT, using = "Invoices")WebElement InvoicesPage;
	@FindBy(how = How.LINK_TEXT, using = "Invoices")WebElement InvoicesPageWthoutClickingOnModules;
	@FindBy(how = How.LINK_TEXT, using = "New Invoice")WebElement NewInvoicePage;
	@FindBy(how = How.LINK_TEXT, using = "Recurring Invoices")WebElement RecurringInvoicesPage;
	@FindBy(how = How.LINK_TEXT, using = "New Recurring Invoice")WebElement NewRecurringInvoicePage;
	@FindBy(how = How.LINK_TEXT, using = "Quotes")WebElement QuotesPage;
	@FindBy(how = How.LINK_TEXT, using = "Create New Quote")WebElement CreateNewQuotePage;
	@FindBy(how = How.LINK_TEXT, using = "Payments")WebElement PaymentsPage;
	@FindBy(how = How.XPATH, using = "//span[text()='Orders']")WebElement OrdersModule;
	@FindBy(how = How.LINK_TEXT, using = "List All Orders")WebElement ListAllOrdersPage;
	@FindBy(how = How.LINK_TEXT, using = "Add New Order")WebElement AddNewOrderPage;
	@FindBy(how = How.XPATH, using = "//span[text()='Documents']")WebElement DocumentsPage;
	@FindBy(how = How.XPATH, using = "//span[text()='Calendar']")WebElement CalendarPage;
	@FindBy(how = How.XPATH, using = "//span[text()='Bank & Cash']")WebElement BankCashModule;
	@FindBy(how = How.LINK_TEXT, using = "New Account")WebElement NewAccountPage;
	@FindBy(how = How.LINK_TEXT, using = "List Accounts")WebElement ListAccountPage;
	@FindBy(how = How.LINK_TEXT, using = "Account Balances")WebElement AccountBalancesPage;
	@FindBy(how = How.XPATH, using = "//span[text()='Products & Services']")WebElement ProductsServicesModule;
	@FindBy(how = How.LINK_TEXT, using = "Products")WebElement ProductsPage;
	@FindBy(how = How.LINK_TEXT, using = "New Product")WebElement NewProductPage;
	@FindBy(how = How.LINK_TEXT, using = "Services")WebElement ServicesPage;
	@FindBy(how = How.LINK_TEXT, using = "New Service")WebElement NewServicePage;
	@FindBy(how = How.XPATH, using = "//span[text()='Reports ']")WebElement ReportsModule;
	@FindBy(how = How.LINK_TEXT, using = "Account Statement")WebElement AccountStatementPage;
	@FindBy(how = How.LINK_TEXT, using = "Income Reports")WebElement IncomeReportsPage;
	@FindBy(how = How.LINK_TEXT, using = "Expense Reports")WebElement ExpenseReportsPage;
	@FindBy(how = How.LINK_TEXT, using = "Income Vs Expense")WebElement IncomeVsExpensePage;
	@FindBy(how = How.LINK_TEXT, using = "Reports by Date")WebElement ReportsbyDatePage;
	@FindBy(how = How.LINK_TEXT, using = "All Income")WebElement AllIncomePage;
	@FindBy(how = How.LINK_TEXT, using = "All Expense")WebElement AllExpensePage;
	@FindBy(how = How.LINK_TEXT, using = "All Transactions")WebElement AllTransactionsPage;
	@FindBy(how = How.XPATH, using = "//span[text()='Utilities']")WebElement UtilitiesModule;
	@FindBy(how = How.LINK_TEXT, using = "Activity Log")WebElement ActivityLogPage;
	@FindBy(how = How.LINK_TEXT, using = "Email Message Log")WebElement EmailMessageLogPage;
	@FindBy(how = How.LINK_TEXT, using = "Database Status")WebElement DatabaseStatusPage;
	@FindBy(how = How.LINK_TEXT, using = "CRON Log")WebElement CRONLogPage;
	@FindBy(how = How.LINK_TEXT, using = "Integration Code")WebElement IntegrationCodePage;
	@FindBy(how = How.LINK_TEXT, using = "System Status")WebElement SystemStatusPage;
	@FindBy(how = How.XPATH, using = "//span[text()='Appearance']")WebElement AppearanceModule;
	@FindBy(how = How.LINK_TEXT, using = "User Interface")WebElement UserInterfacePage;
	@FindBy(how = How.LINK_TEXT, using = "Customize")WebElement CustomizePage;
	@FindBy(how = How.LINK_TEXT, using = "Editor")WebElement EditorPage;
	@FindBy(how = How.LINK_TEXT, using = "Themes")WebElement ThemesPage;
	@FindBy(how = How.XPATH, using = "//span[text()='Plugins']")WebElement PluginsPage;
	@FindBy(how = How.XPATH, using = "//span[text()='Settings']")WebElement SettingsModule;
	@FindBy(how = How.LINK_TEXT, using = "General Settings")WebElement GeneralSettingsPage;
	@FindBy(how = How.LINK_TEXT, using = "Staff")WebElement StaffPage;
	@FindBy(how = How.LINK_TEXT, using = "Roles")WebElement RolesPage;
	@FindBy(how = How.LINK_TEXT, using = "Localization")WebElement LocalizationPage;
	@FindBy(how = How.LINK_TEXT, using = "Currencies")WebElement CurrenciesPage;
	@FindBy(how = How.LINK_TEXT, using = "Payment Gateways")WebElement PaymentGatewaysPage;
	@FindBy(how = How.LINK_TEXT, using = "Expense Categories")WebElement ExpenseCategoriesPage;
	@FindBy(how = How.LINK_TEXT, using = "Income Categories")WebElement IncomeCategoriesPage;
	@FindBy(how = How.LINK_TEXT, using = "Manage Tags")WebElement ManageTagsPage;
	@FindBy(how = How.LINK_TEXT, using = "Payment Methods")WebElement PaymentMethodsPage;
	@FindBy(how = How.LINK_TEXT, using = "Sales Taxes")WebElement SalesTaxesPage;
	@FindBy(how = How.LINK_TEXT, using = "Email Settings")WebElement EmailSettingsPage;
	@FindBy(how = How.LINK_TEXT, using = "Email Templates")WebElement EmailTemplatesPage;
	@FindBy(how = How.LINK_TEXT, using = "Custom Contact Fields")WebElement CustomContactFieldsPage;
	@FindBy(how = How.LINK_TEXT, using = "Automation Settings")WebElement AutomationSettingsPage;
	@FindBy(how = How.LINK_TEXT, using = "API Access")WebElement APIAccessPage;
	@FindBy(how = How.LINK_TEXT, using = "Choose Features")WebElement ChooseFeaturesPage;
	@FindBy(how = How.LINK_TEXT, using = "About")WebElement AboutPage;
	
	// Dashboard Page
	public void goToDashboardPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		DashboardPage.click();
	}
	//Customers Page
	public void goToAddCustomerPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		CustomersModule.click();
		BasePage.waitForImplicitlyWait();
		AddCustomerPage.click();
		
	}
	public void goToListCustomersPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		CustomersModule.click();
		BasePage.waitForImplicitlyWait();
		ListCustomersPage.click();
	}
	
	public void goToGroupsPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		CustomersModule.click();
		BasePage.waitForImplicitlyWait();
		GroupsPage.click();
	}
	// Companies Page
	public void goToCompaniesPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		CompaniesPage.click();
	}
	// Transactions Page 
	public void goToNewDepositPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		TransactionsModule.click();
		BasePage.waitForImplicitlyWait();
		NewDepositPage.click();
		
	}
	public void goToNewExpensePage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		TransactionsModule.click();
		BasePage.waitForImplicitlyWait();
		NewExpensePage.click();
	}
	public void goToTransferPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		TransactionsModule.click();
		BasePage.waitForImplicitlyWait();
		TransferPage.click();
	}
	public void goToViewTransactionsPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		TransactionsModule.click();
		BasePage.waitForImplicitlyWait();
		ViewTransactionsPage.click();
	}
	public void goToBalanceSheetPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		TransactionsModule.click();
		BasePage.waitForImplicitlyWait();
		BalanceSheetPage.click();
	}
	//Sales Page
	public void goToInvoicesPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SalesModule.click();
		BasePage.waitForImplicitlyWait();
		InvoicesPage.click();
		
	}
	public void goToNewInvoicePage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SalesModule.click();
		BasePage.waitForImplicitlyWait();
		NewInvoicePage.click();
	}
	public void goToRecurringInvoicesPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SalesModule.click();
		BasePage.waitForImplicitlyWait();
		RecurringInvoicesPage.click();
	}
	public void goToNewRecurringInvoicePage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SalesModule.click();
		BasePage.waitForImplicitlyWait();
		NewRecurringInvoicePage.click();
	}
	public void goToQuotesPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SalesModule.click();
		BasePage.waitForImplicitlyWait();
		QuotesPage.click();
	}
	public void goToCreateNewQuotePage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SalesModule.click();
		BasePage.waitForImplicitlyWait();
		CreateNewQuotePage.click();
	}
	public void goToPaymentsPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SalesModule.click();
		BasePage.waitForImplicitlyWait();
		PaymentsPage.click();
	}
	public void goToInvoicesPageWithoutClickingOnModule() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		InvoicesPageWthoutClickingOnModules.click();
	}
	//Orders Page
	public void goToListAllOrdersPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		OrdersModule.click();
		BasePage.waitForImplicitlyWait();
		ListAllOrdersPage.click();
		
	}
	public void goToAddNewOrderPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		OrdersModule.click();
		BasePage.waitForImplicitlyWait();
		AddNewOrderPage.click();
	}
	//Documents Page 
	public void goToDocumentsPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		OrdersModule.click();
		BasePage.waitForImplicitlyWait();
		DocumentsPage.click();
	}
	//Calendar Page 
	public void goToCalendarPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		CalendarPage.click();
	}
	//Bank&Cash Page
	public void goToNewAccountPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		BankCashModule.click();
		BasePage.waitForImplicitlyWait();
		NewAccountPage.click();
		
	}
	public void goToListAccountPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		BankCashModule.click();
		BasePage.waitForImplicitlyWait();
		ListAccountPage.click();
	}
	public void goToAccountBalancesPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		BankCashModule.click();
		BasePage.waitForImplicitlyWait();
		AccountBalancesPage.click();
	}
	//Products$Services Page
	public void goToProductsPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		ProductsServicesModule.click();
		BasePage.waitForImplicitlyWait();
		ProductsPage.click();
		
	}
	public void goToNewProductPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		ProductsServicesModule.click();
		BasePage.waitForImplicitlyWait();
		NewProductPage.click();
	}
	public void goToServicesPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		ProductsServicesModule.click();
		BasePage.waitForImplicitlyWait();
		ServicesPage.click();
	}
	public void goToNewServicePage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		ProductsServicesModule.click();
		BasePage.waitForImplicitlyWait();
		NewServicePage.click();
	}
	//Reports Page
	public void goToAccountStatementPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		ReportsModule.click();
		BasePage.waitForImplicitlyWait();
		AccountStatementPage.click();
		
	}
	
	public void goToIncomeReportsPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		ReportsModule.click();
		BasePage.waitForImplicitlyWait();
		IncomeReportsPage.click();
	}
	public void goToExpenseReportsPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		ReportsModule.click();
		BasePage.waitForImplicitlyWait();
		ExpenseReportsPage.click();
	}
	public void goToIncomeVsExpensePage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		ReportsModule.click();
		BasePage.waitForImplicitlyWait();
		IncomeVsExpensePage.click();
	}
	public void goToReportsbyDatePage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		ReportsModule.click();
		BasePage.waitForImplicitlyWait();
		ReportsbyDatePage.click();
	}
	public void goToAllIncomePage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		ReportsModule.click();
		BasePage.waitForImplicitlyWait();
		AllIncomePage.click();
	}
	public void goToAllExpensePage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		ReportsModule.click();
		BasePage.waitForImplicitlyWait();
		AllExpensePage.click();
	}
	public void goToAllTransactionsPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		ReportsModule.click();
		BasePage.waitForImplicitlyWait();
		AllTransactionsPage.click();
	}
	//Utilities
	public void goToActivityLogPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		UtilitiesModule.click();
		BasePage.waitForImplicitlyWait();
		ActivityLogPage.click();
		
	}
	public void goToEmailMessageLogPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		UtilitiesModule.click();
		BasePage.waitForImplicitlyWait();
		EmailMessageLogPage.click();
	}
	public void goToDatabaseStatusPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		UtilitiesModule.click();
		BasePage.waitForImplicitlyWait();
		DatabaseStatusPage.click();
	}
	public void goToCRONLogPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		UtilitiesModule.click();
		BasePage.waitForImplicitlyWait();
		CRONLogPage.click();
	}
	public void goToIntegrationCodePage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		UtilitiesModule.click();
		BasePage.waitForImplicitlyWait();
		IntegrationCodePage.click();
	}
	public void goToSystemStatusPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		UtilitiesModule.click();
		BasePage.waitForImplicitlyWait();
		SystemStatusPage.click();
	}
	//Appearance Page
	public void goToUserInterfacePage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		AppearanceModule.click();
		BasePage.waitForImplicitlyWait();
		UserInterfacePage.click();
		
	}
	public void goToCustomizePage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		AppearanceModule.click();
		BasePage.waitForImplicitlyWait();
		CustomizePage.click();
	}
	public void goToEditorPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		AppearanceModule.click();
		BasePage.waitForImplicitlyWait();
		EditorPage.click();
	}
	public void goToThemesPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		AppearanceModule.click();
		BasePage.waitForImplicitlyWait();
		ThemesPage.click();
	}
	//Plugins Page
	public void goToPluginsPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		PluginsPage.click();
	}
	//Settings Page
	public void goToGeneralSettingsPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SettingsModule.click();
		BasePage.waitForImplicitlyWait();
		GeneralSettingsPage.click();
		
	}
	public void goToStaffPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SettingsModule.click();
		BasePage.waitForImplicitlyWait();
		StaffPage.click();
	}
	public void goToRolesPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SettingsModule.click();
		BasePage.waitForImplicitlyWait();
		RolesPage.click();
	}
	public void goToLocalizationPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SettingsModule.click();
		BasePage.waitForImplicitlyWait();
		LocalizationPage.click();
	}
	public void goToCurrenciesPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SettingsModule.click();
		BasePage.waitForImplicitlyWait();
		CurrenciesPage.click();
	}
	public void goToPaymentGatewaysPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SettingsModule.click();
		BasePage.waitForImplicitlyWait();
		PaymentGatewaysPage.click();
	}
	public void goToExpenseCategoriesPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SettingsModule.click();
		BasePage.waitForImplicitlyWait();
		ExpenseCategoriesPage.click();
	}
	public void goToIncomeCategoriesPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SettingsModule.click();
		BasePage.waitForImplicitlyWait();
		IncomeCategoriesPage.click();
	}
	public void goToManageTagsPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SettingsModule.click();
		BasePage.waitForImplicitlyWait();
		ManageTagsPage.click();
	}
	public void goToPaymentMethodsPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SettingsModule.click();
		BasePage.waitForImplicitlyWait();
		PaymentMethodsPage.click();
	}
	public void goToSalesTaxesPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SettingsModule.click();
		BasePage.waitForImplicitlyWait();
		SalesTaxesPage.click();
	}
	public void goToEmailSettingsPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SettingsModule.click();
		BasePage.waitForImplicitlyWait();
		EmailSettingsPage.click();
	}
	public void goToEmailTemplatesPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SettingsModule.click();
		BasePage.waitForImplicitlyWait();
		EmailTemplatesPage.click();
	}
	public void goToCustomContactFieldsPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SettingsModule.click();
		BasePage.waitForImplicitlyWait();
		CustomContactFieldsPage.click();
	}
	public void goToAutomationSettingsPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SettingsModule.click();
		BasePage.waitForImplicitlyWait();
		AutomationSettingsPage.click();
	}
	public void goToAPIAccessPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SettingsModule.click();
		BasePage.waitForImplicitlyWait();
		APIAccessPage.click();
	}
	public void goToChooseFeaturesPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SettingsModule.click();
		BasePage.waitForImplicitlyWait();
		ChooseFeaturesPage.click();
	}
	public void goToAboutPage() throws InterruptedException {
		BasePage.waitForImplicitlyWait();
		SettingsModule.click();
		BasePage.waitForImplicitlyWait();
		AboutPage.click();
	}
}
