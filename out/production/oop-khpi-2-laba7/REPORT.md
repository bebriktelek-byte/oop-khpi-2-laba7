# REPORT

## Variant
- **number**: 9
- **topic**: Документи університетського адміністрування.

## Interface justification
- **why each interface is semantically valid**: Інтерфейси описують незалежні можливості (ролі) об'єктів. `Printable` означає, що об'єкт можна роздрукувати, а `Archivable` — що його можна зберегти в архів. Це саме поведінка, а не стан чи сутність.

## Contracts and implementations
- **first interface**: `Printable`
    - **implementing classes**: `InternshipLetter`, `EnrollmentCertificate`
- **second interface**: `Archivable`
    - **implementing classes**: `TranscriptRequest`, `EnrollmentCertificate`

## Multiple interface implementation
- **class implementing more than one interface**: `EnrollmentCertificate`
- **why this is meaningful**: Довідка про зарахування повинна і видаватися на руки (друк), і зберігатися в базі університету (архів). Множинна реалізація ідеально описує набір цих незалежних функцій.

## Client code
- **where interface types are used**: У класі `Main` створено масиви `Printable[]` та `Archivable[]`, через які в циклах `for` викликаються відповідні методи без прив'язки до конкретних класів.

## Additional task
- **short conclusion about a possible interface-based redesign**: Інтерфейси тут доречніші за єдину ієрархію успадкування (наприклад, від суперкласу `Document`), оскільки деякі документи лише друкуються, а деякі — лише архівуються. Спільний суперклас змусив би створювати порожні методи (фіктивні реалізації), що порушило б принципи ООП.

## Final conclusion
- **what the model demonstrates about interface-based design**: Модель демонструє, що інтерфейси дозволяють гнучко комбінувати контракти та обробляти різні об'єкти поліморфно за їхніми можливостями, уникаючи штучних таксономій.