package client

import javax.crypto.spec.SecretKeySpec

import org.scalatest.{FunSuite, Matchers}
import sun.misc.BASE64Decoder

class SymmetricEncryptorSpecs extends FunSuite with Matchers {

  val symmetricEncryptor = new SymmetricEncryptor("prayagupd")

  test("given algorithm encrypts data which is 800 bytes") {

    val enc = symmetricEncryptor.enc("FyJhY2Nlc3NUb2tlbiI6IllXTXRZaVRvRDYySkVlZVhaZm9XUGoyQmhhd2g5WnpFWU5qc000TDUya1FpX2VaU2YtVFBBQUFBQUFBQUFBQSIsInRpbWVUb0xpdmUiOjE4MDAsImlzc3VlZFRpbWVzdGFtcCI6MTUwNzYxOTEyMjY4MCwiYXNzZXJ0aW9uIjoidTo2R0F0cnNYMlN5LVlkTWZWakxPcm5SSnRZbmJGSzJES0IweVhiZHlrRTZrIiwicHJpbmNpcGFsIjoidTo2R0F0cnNYMlN5LVlkTWZWakxPcm5SSnRZbmJGSzJES0IweVhiZHlrRTZrIiwicHJpbmNpcGFsSWRlbnRpZmllciI6IjFhOTRhNDA3LTdiOTItMTFlNy04NzBjLWZhMTYzZTNkODE4NSIsImNvbnN1bWFibGUiOmZhbHNlLCJ2ZXJzaW9uIjoiMS4wIn0.O4B-7gjBrM525KMAjCcQUkHAfwwlkBRxj1zcEsFsU6NxlE_zvNKOzr4jo1xDlf9960Y9t9hDepVG8LKrjf46IutTDe8x9Kvuyv_eSiaP5tduJMDBObY5STt6tQw_M0gaRlSJ_y_AnHzYUJ9xAnscnHvMmEo0DuQ0tKnrani27gU_lgbTds8XArdqRvBLk-PBrK4PxYkfoov9blPyzizIO3Aez7NbLnplWodtU6Faj-3hAVD9fmiEtxcEVsaz8iio-OAR41Wqiy0BcFWvvJf6ukyQQpuF9jz9jCJEbQT3YhPcY0pOrLBz3vFe2j6VI_ljXWrSD3H28h4zmxTfjujRSw")

    //enc shouldBe Some("PzHdLqdlYvpVcPRXHukeXTCrZUlnntlHUtHlCzj4MWQ9eGs6USdgX/DFbIWRBVVqXUDCIPDYdNV0JaqPTE1yYkjHQYRe12TqEfsqOWBo1t27qdXfkVendVZsPqz67iaDkz7e8Hjvgw/7fNd6fpojmVmWB6swz9DDJzEItItrqBVRQuRXG+hbrFuYmrQdR3mEYM4zMWwQ92Kn67VOWEC/ATV2hDqaj68D2UvvXZyvj/1DTsNCsgk0bWUqWuwhF2OqIjdVzX2RMUDgpy9fVOI2bcSYd1Q45u6tOcxDBF6Lko31bdNe1KrqspzsUKAUZV8xSkXHLvf6e7upRk8CacEUUBm+bht9LHGotTtgLxmVDhIiN1XNfZExQOCnL19U4jZtxJh3VDjm7q05zEMEXouSjfVt017UquqynOxQoBRlXzFKRccu9/p7u6lGTwJpwRRQ9pclTpuMnsnHzn4J6hTgPjR8Pgj7A+UMWRQT/32nuL92GdCoeT9FpL0etu9LRxfUko3pjzQKrv5A9bJPaTAKwKvDfVuE9LWizn1Q6ws84p7fJ4HvRudUzRdBq4HIW40cynUtz9g/jqi8Yi/rREAYOrfWK1MDA2/sE9THLx58TQLMNoqeNy1si0SpkCPR/bFaW9ZAfkCv7nU2ECBgvSDGvV4wjWh+o0eB8u5EZPU9yLWGogG9rkbunhoojl0MGXoTL6LgCp8NLCOe9mEm9OtWBtCkjzIMezwUs1gNQ8IqWZwyVGyKr200m6XZRRSqzlZhfk2h3GxXCWQzjvuVZ6A7iQkM2ezTNGIT89Lf5H51d2D/SZ54WcvWepsQawwIaXO2BBMiAbPV/qgwgH/bTtuY7SW3/GBZWTjnfJPRm+MEe52AFiXdKNe/1yRnGZNv0B+FDKI6WSoRbV8YOq+B4ZOiqDdyv5oMLIeTko5Uv+uu0NzEF9qr7gfNyCfnRpMSkE4eM1NlycuKqxHmbwrVE3l8pkvaauTQLC8h4w1/rRIXWRxElJn2ehIziEOFH/yJDqyWSap6CbCORSlG8Rn67kEokC06mq4zdl6Azfg2xfbTTDiq955bndW+c/p4zEnF4Iku")
  }

}
