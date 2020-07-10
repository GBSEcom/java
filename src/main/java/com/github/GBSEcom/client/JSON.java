/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * OpenAPI spec version: 6.12.0.20200605.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import com.github.GBSEcom.model.*;
import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

public class JSON {
    private Gson gson;
    private boolean isLenientOnJson = false;
    private DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
                .registerTypeSelector(AccountInfoLookupRequest.class, new TypeSelector() {
                    @Override
                    public Class getClassForElement(JsonElement readElement) {
                        Map classByDiscriminatorValue = new HashMap();
                        classByDiscriminatorValue.put("PaymentCardInfoLookupRequest".toUpperCase(Locale.ROOT), PaymentCardInfoLookupRequest.class);
                        classByDiscriminatorValue.put("PaymentTokenInfoLookupRequest".toUpperCase(Locale.ROOT), PaymentTokenInfoLookupRequest.class);
                        classByDiscriminatorValue.put("AccountInfoLookupRequest".toUpperCase(Locale.ROOT), AccountInfoLookupRequest.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "requestType"));
                    }
          })
                .registerTypeSelector(AccountVerificationRequest.class, new TypeSelector() {
                    @Override
                    public Class getClassForElement(JsonElement readElement) {
                        Map classByDiscriminatorValue = new HashMap();
                        classByDiscriminatorValue.put("PaymentCardVerificationRequest".toUpperCase(Locale.ROOT), PaymentCardVerificationRequest.class);
                        classByDiscriminatorValue.put("PaymentTokenVerificationRequest".toUpperCase(Locale.ROOT), PaymentTokenVerificationRequest.class);
                        classByDiscriminatorValue.put("AccountVerificationRequest".toUpperCase(Locale.ROOT), AccountVerificationRequest.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "requestType"));
                    }
          })
                .registerTypeSelector(AuthenticationRequest.class, new TypeSelector() {
                    @Override
                    public Class getClassForElement(JsonElement readElement) {
                        Map classByDiscriminatorValue = new HashMap();
                        classByDiscriminatorValue.put("Secure3D10AuthenticationRequest".toUpperCase(Locale.ROOT), Secure3D10AuthenticationRequest.class);
                        classByDiscriminatorValue.put("Secure3D21AuthenticationRequest".toUpperCase(Locale.ROOT), Secure3D21AuthenticationRequest.class);
                        classByDiscriminatorValue.put("UnionPayAuthenticationRequest".toUpperCase(Locale.ROOT), UnionPayAuthenticationRequest.class);
                        classByDiscriminatorValue.put("AuthenticationRequest".toUpperCase(Locale.ROOT), AuthenticationRequest.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "authenticationType"));
                    }
          })
                .registerTypeSelector(AuthenticationResult.class, new TypeSelector() {
                    @Override
                    public Class getClassForElement(JsonElement readElement) {
                        Map classByDiscriminatorValue = new HashMap();
                        classByDiscriminatorValue.put("Secure3D10AuthenticationResult".toUpperCase(Locale.ROOT), Secure3D10AuthenticationResult.class);
                        classByDiscriminatorValue.put("Secure3D21AuthenticationResult".toUpperCase(Locale.ROOT), Secure3D21AuthenticationResult.class);
                        classByDiscriminatorValue.put("AuthenticationResult".toUpperCase(Locale.ROOT), AuthenticationResult.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "authenticationType"));
                    }
          })
                .registerTypeSelector(AuthenticationUpdateRequest.class, new TypeSelector() {
                    @Override
                    public Class getClassForElement(JsonElement readElement) {
                        Map classByDiscriminatorValue = new HashMap();
                        classByDiscriminatorValue.put("UnionPayAuthenticationUpdateRequest".toUpperCase(Locale.ROOT), UnionPayAuthenticationUpdateRequest.class);
                        classByDiscriminatorValue.put("Secure3D10AuthenticationUpdateRequest".toUpperCase(Locale.ROOT), Secure3D10AuthenticationUpdateRequest.class);
                        classByDiscriminatorValue.put("Secure3D21AuthenticationUpdateRequest".toUpperCase(Locale.ROOT), Secure3D21AuthenticationUpdateRequest.class);
                        classByDiscriminatorValue.put("AuthenticationUpdateRequest".toUpperCase(Locale.ROOT), AuthenticationUpdateRequest.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "authenticationType"));
                    }
          })
                .registerTypeSelector(CurrencyConversion.class, new TypeSelector() {
                    @Override
                    public Class getClassForElement(JsonElement readElement) {
                        Map classByDiscriminatorValue = new HashMap();
                        classByDiscriminatorValue.put("Dcc".toUpperCase(Locale.ROOT), Dcc.class);
                        classByDiscriminatorValue.put("DynamicPricing".toUpperCase(Locale.ROOT), DynamicPricing.class);
                        classByDiscriminatorValue.put("CurrencyConversion".toUpperCase(Locale.ROOT), CurrencyConversion.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "conversionType"));
                    }
          })
                .registerTypeSelector(Disbursement.class, new TypeSelector() {
                    @Override
                    public Class getClassForElement(JsonElement readElement) {
                        Map classByDiscriminatorValue = new HashMap();
                        classByDiscriminatorValue.put("DisbursementTransactionType".toUpperCase(Locale.ROOT), DisbursementTransactionType.class);
                        classByDiscriminatorValue.put("FundingTransactionType".toUpperCase(Locale.ROOT), FundingTransactionType.class);
                        classByDiscriminatorValue.put("Disbursement".toUpperCase(Locale.ROOT), Disbursement.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "disbursementType"));
                    }
          })
                .registerTypeSelector(ExchangeRateRequest.class, new TypeSelector() {
                    @Override
                    public Class getClassForElement(JsonElement readElement) {
                        Map classByDiscriminatorValue = new HashMap();
                        classByDiscriminatorValue.put("DCCExchangeRateRequest".toUpperCase(Locale.ROOT), DCCExchangeRateRequest.class);
                        classByDiscriminatorValue.put("DynamicPricingExchangeRateRequest".toUpperCase(Locale.ROOT), DynamicPricingExchangeRateRequest.class);
                        classByDiscriminatorValue.put("ExchangeRateRequest".toUpperCase(Locale.ROOT), ExchangeRateRequest.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "requestType"));
                    }
          })
                .registerTypeSelector(PaymentCardPaymentTokenUpdateRequest.class, new TypeSelector() {
                    @Override
                    public Class getClassForElement(JsonElement readElement) {
                        Map classByDiscriminatorValue = new HashMap();
                        classByDiscriminatorValue.put("PaymentCardPaymentTokenUpdateRequest".toUpperCase(Locale.ROOT), PaymentCardPaymentTokenUpdateRequest.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "requestType"));
                    }
          })
                .registerTypeSelector(PaymentSchedulesRequest.class, new TypeSelector() {
                    @Override
                    public Class getClassForElement(JsonElement readElement) {
                        Map classByDiscriminatorValue = new HashMap();
                        classByDiscriminatorValue.put("PaymentMethodPaymentSchedulesRequest".toUpperCase(Locale.ROOT), PaymentMethodPaymentSchedulesRequest.class);
                        classByDiscriminatorValue.put("ReferencedOrderPaymentSchedulesRequest".toUpperCase(Locale.ROOT), ReferencedOrderPaymentSchedulesRequest.class);
                        classByDiscriminatorValue.put("PaymentSchedulesRequest".toUpperCase(Locale.ROOT), PaymentSchedulesRequest.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "requestType"));
                    }
          })
                .registerTypeSelector(PaymentTokenizationRequest.class, new TypeSelector() {
                    @Override
                    public Class getClassForElement(JsonElement readElement) {
                        Map classByDiscriminatorValue = new HashMap();
                        classByDiscriminatorValue.put("ReferencedOrderPaymentTokenizationRequest".toUpperCase(Locale.ROOT), ReferencedOrderPaymentTokenizationRequest.class);
                        classByDiscriminatorValue.put("PaymentCardPaymentTokenizationRequest".toUpperCase(Locale.ROOT), PaymentCardPaymentTokenizationRequest.class);
                        classByDiscriminatorValue.put("PaymentDevicePaymentTokenizationRequest".toUpperCase(Locale.ROOT), PaymentDevicePaymentTokenizationRequest.class);
                        classByDiscriminatorValue.put("PaymentTokenizationRequest".toUpperCase(Locale.ROOT), PaymentTokenizationRequest.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "requestType"));
                    }
          })
                .registerTypeSelector(PrimaryTransaction.class, new TypeSelector() {
                    @Override
                    public Class getClassForElement(JsonElement readElement) {
                        Map classByDiscriminatorValue = new HashMap();
                        classByDiscriminatorValue.put("PaymentCardForcedTicketTransaction".toUpperCase(Locale.ROOT), PaymentCardForcedTicketTransaction.class);
                        classByDiscriminatorValue.put("PaymentCardPayerAuthTransaction".toUpperCase(Locale.ROOT), PaymentCardPayerAuthTransaction.class);
                        classByDiscriminatorValue.put("PaypalCreditTransaction".toUpperCase(Locale.ROOT), PaypalCreditTransaction.class);
                        classByDiscriminatorValue.put("ChinaPnRSaleTransaction".toUpperCase(Locale.ROOT), ChinaPnRSaleTransaction.class);
                        classByDiscriminatorValue.put("AliPaySaleTransaction".toUpperCase(Locale.ROOT), AliPaySaleTransaction.class);
                        classByDiscriminatorValue.put("SepaSaleTransaction".toUpperCase(Locale.ROOT), SepaSaleTransaction.class);
                        classByDiscriminatorValue.put("WalletSaleTransaction".toUpperCase(Locale.ROOT), WalletSaleTransaction.class);
                        classByDiscriminatorValue.put("WalletPreAuthTransaction".toUpperCase(Locale.ROOT), WalletPreAuthTransaction.class);
                        classByDiscriminatorValue.put("PaymentTokenCreditTransaction".toUpperCase(Locale.ROOT), PaymentTokenCreditTransaction.class);
                        classByDiscriminatorValue.put("PaymentTokenPreAuthTransaction".toUpperCase(Locale.ROOT), PaymentTokenPreAuthTransaction.class);
                        classByDiscriminatorValue.put("PaymentTokenSaleTransaction".toUpperCase(Locale.ROOT), PaymentTokenSaleTransaction.class);
                        classByDiscriminatorValue.put("PaymentCardPreAuthTransaction".toUpperCase(Locale.ROOT), PaymentCardPreAuthTransaction.class);
                        classByDiscriminatorValue.put("PaymentCardSaleTransaction".toUpperCase(Locale.ROOT), PaymentCardSaleTransaction.class);
                        classByDiscriminatorValue.put("PaymentCardCreditTransaction".toUpperCase(Locale.ROOT), PaymentCardCreditTransaction.class);
                        classByDiscriminatorValue.put("PaymentCardDisbursementTransaction".toUpperCase(Locale.ROOT), PaymentCardDisbursementTransaction.class);
                        classByDiscriminatorValue.put("PaymentTokenDisbursementTransaction".toUpperCase(Locale.ROOT), PaymentTokenDisbursementTransaction.class);
                        classByDiscriminatorValue.put("PaymentDevicePreAuthTransaction".toUpperCase(Locale.ROOT), PaymentDevicePreAuthTransaction.class);
                        classByDiscriminatorValue.put("PaymentDeviceSaleTransaction".toUpperCase(Locale.ROOT), PaymentDeviceSaleTransaction.class);
                        classByDiscriminatorValue.put("PaymentDeviceCreditTransaction".toUpperCase(Locale.ROOT), PaymentDeviceCreditTransaction.class);
                        classByDiscriminatorValue.put("PaymentDeviceDisbursementTransaction".toUpperCase(Locale.ROOT), PaymentDeviceDisbursementTransaction.class);
                        classByDiscriminatorValue.put("AchPreAuthTransaction".toUpperCase(Locale.ROOT), AchPreAuthTransaction.class);
                        classByDiscriminatorValue.put("AchSaleTransaction".toUpperCase(Locale.ROOT), AchSaleTransaction.class);
                        classByDiscriminatorValue.put("AchCreditTransaction".toUpperCase(Locale.ROOT), AchCreditTransaction.class);
                        classByDiscriminatorValue.put("PrimaryTransaction".toUpperCase(Locale.ROOT), PrimaryTransaction.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "requestType"));
                    }
          })
                .registerTypeSelector(SecondaryTransaction.class, new TypeSelector() {
                    @Override
                    public Class getClassForElement(JsonElement readElement) {
                        Map classByDiscriminatorValue = new HashMap();
                        classByDiscriminatorValue.put("PostAuthTransaction".toUpperCase(Locale.ROOT), PostAuthTransaction.class);
                        classByDiscriminatorValue.put("AchPostAuthTransaction".toUpperCase(Locale.ROOT), AchPostAuthTransaction.class);
                        classByDiscriminatorValue.put("ReturnTransaction".toUpperCase(Locale.ROOT), ReturnTransaction.class);
                        classByDiscriminatorValue.put("AchReturnTransaction".toUpperCase(Locale.ROOT), AchReturnTransaction.class);
                        classByDiscriminatorValue.put("VoidTransaction".toUpperCase(Locale.ROOT), VoidTransaction.class);
                        classByDiscriminatorValue.put("VoidPreAuthTransactions".toUpperCase(Locale.ROOT), VoidPreAuthTransactions.class);
                        classByDiscriminatorValue.put("AchVoidTransaction".toUpperCase(Locale.ROOT), AchVoidTransaction.class);
                        classByDiscriminatorValue.put("SecondaryTransaction".toUpperCase(Locale.ROOT), SecondaryTransaction.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "requestType"));
                    }
          })
                .registerTypeSelector(TeleCheckAchPaymentMethod.class, new TypeSelector() {
                    @Override
                    public Class getClassForElement(JsonElement readElement) {
                        Map classByDiscriminatorValue = new HashMap();
                        classByDiscriminatorValue.put("TeleCheckICAPaymentMethod".toUpperCase(Locale.ROOT), TeleCheckICAPaymentMethod.class);
                        classByDiscriminatorValue.put("TeleCheckCBPPaymentMethod".toUpperCase(Locale.ROOT), TeleCheckCBPPaymentMethod.class);
                        classByDiscriminatorValue.put("TeleCheckAchPaymentMethod".toUpperCase(Locale.ROOT), TeleCheckAchPaymentMethod.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "achType"));
                    }
          })
                .registerTypeSelector(WalletPaymentMethod.class, new TypeSelector() {
                    @Override
                    public Class getClassForElement(JsonElement readElement) {
                        Map classByDiscriminatorValue = new HashMap();
                        classByDiscriminatorValue.put("EncryptedApplePayWalletPaymentMethod".toUpperCase(Locale.ROOT), EncryptedApplePayWalletPaymentMethod.class);
                        classByDiscriminatorValue.put("EncryptedGooglePayWalletPaymentMethod".toUpperCase(Locale.ROOT), EncryptedGooglePayWalletPaymentMethod.class);
                        classByDiscriminatorValue.put("EncryptedSamsungPayWalletPaymentMethod".toUpperCase(Locale.ROOT), EncryptedSamsungPayWalletPaymentMethod.class);
                        classByDiscriminatorValue.put("DecryptedApplePayWalletPaymentMethod".toUpperCase(Locale.ROOT), DecryptedApplePayWalletPaymentMethod.class);
                        classByDiscriminatorValue.put("DecryptedGooglePayWalletPaymentMethod".toUpperCase(Locale.ROOT), DecryptedGooglePayWalletPaymentMethod.class);
                        classByDiscriminatorValue.put("DecryptedSamsungPayWalletPaymentMethod".toUpperCase(Locale.ROOT), DecryptedSamsungPayWalletPaymentMethod.class);
                        classByDiscriminatorValue.put("MasterpassWalletPaymentMethod".toUpperCase(Locale.ROOT), MasterpassWalletPaymentMethod.class);
                        classByDiscriminatorValue.put("WalletPaymentMethod".toUpperCase(Locale.ROOT), WalletPaymentMethod.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "walletType"));
                    }
          })
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue.toUpperCase(Locale.ROOT));
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    public JSON() {
        gson = createGson()
            .registerTypeAdapter(Date.class, dateTypeAdapter)
            .registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter)
            .registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter)
            .registerTypeAdapter(LocalDate.class, localDateTypeAdapter)
            .registerTypeAdapter(byte[].class, byteArrayAdapter)
            .create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     * @return JSON
     */
    public JSON setGson(Gson gson) {
        this.gson = gson;
        return this;
    }

    public JSON setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
        return this;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public JSON setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
        return this;
    }

    public JSON setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
        return this;
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public JSON setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
        return this;
    }

    public JSON setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
        return this;
    }

}
