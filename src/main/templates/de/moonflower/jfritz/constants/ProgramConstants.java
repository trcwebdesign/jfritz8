package de.moonflower.jfritz.constants;

public final class ProgramConstants {
    public static final String PROGRAM_NAME = "${capitalizedName}";
    public static final String PROGRAM_VERSION_LONG = "${majorVersion}.${minorVersion}.${patchVersion}.${shortRevision}";
    public static final String REVISION = "${shortRevision}";
    public static final String BUILD_DATE = "${buildDateTime}";

    public static final String MAJOR = "${majorVersion}";
    public static final String MINOR = "${minorVersion}";
    public static final String PATCH = "${patchVersion}";
    public static final String VERSION_POSTFIX = "${postfix}";

    public static final String PROGRAM_VERSION = MAJOR + "." + MINOR + "." + PATCH;
}
