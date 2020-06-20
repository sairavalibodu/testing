{
  "id": "0afc9197-e61b-4b1a-a0cb-5f4770eea02e",
  "version": "2.0",
  "name": "amazon fashion",
  "url": "https://www.amazon.in",
  "tests": [{
    "id": "482d0bf6-f601-4514-b423-06d458c6dc68",
    "name": "bestsellers",
    "commands": [{
      "id": "0f62e541-ba17-48d4-897e-99784e8ccca7",
      "comment": "",
      "command": "open",
      "target": "/",
      "targets": [],
      "value": ""
    }, {
      "id": "b613a71b-0d96-4536-9945-7980e94aa445",
      "comment": "",
      "command": "setWindowSize",
      "target": "550x692",
      "targets": [],
      "value": ""
    }, {
      "id": "5632f7b7-b83a-4125-94b9-7ead0a49647c",
      "comment": "",
      "command": "mouseOver",
      "target": "linkText=Today's Deals",
      "targets": [
        ["linkText=Today's Deals", "linkText"],
        ["css=#nav-xshop > .nav-a:nth-child(5)", "css:finder"],
        ["xpath=//div[@id='nav-xshop']/a[4]", "xpath:idRelative"],
        ["xpath=//a[contains(@href, '/gp/goldbox?ref_=nav_topnav_deals')]", "xpath:href"],
        ["xpath=//div[3]/div[2]/div/a[4]", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "ae45caf7-0e76-462d-8c93-5cf8e01bf6b7",
      "comment": "",
      "command": "mouseOut",
      "target": "linkText=Today's Deals",
      "targets": [
        ["linkText=Today's Deals", "linkText"],
        ["css=#nav-xshop > .nav-a:nth-child(5)", "css:finder"],
        ["xpath=//div[@id='nav-xshop']/a[4]", "xpath:idRelative"],
        ["xpath=//a[contains(@href, '/gp/goldbox?ref_=nav_topnav_deals')]", "xpath:href"],
        ["xpath=//div[3]/div[2]/div/a[4]", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "4ce707ac-3e2d-48e6-9198-51c903318b07",
      "comment": "",
      "command": "mouseOver",
      "target": "css=.cropped-image-map-size:nth-child(2) img",
      "targets": [
        ["css=.cropped-image-map-size:nth-child(2) img", "css:finder"],
        ["xpath=//img[@alt='Desh ka dumdaar Smartphone']", "xpath:img"],
        ["xpath=//div[@id='hAWYNXKJRp8IWJI2hKQZ4w']/div/div/span/a/img", "xpath:idRelative"],
        ["xpath=//li[4]/div/div/div/div/span/a/img", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "35384cb0-f85b-4e0a-9d45-cf3ade900b24",
      "comment": "",
      "command": "mouseOut",
      "target": "css=.cropped-image-map-size:nth-child(2) img",
      "targets": [
        ["css=.cropped-image-map-size:nth-child(2) img", "css:finder"],
        ["xpath=//img[@alt='Desh ka dumdaar Smartphone']", "xpath:img"],
        ["xpath=//div[@id='hAWYNXKJRp8IWJI2hKQZ4w']/div/div/span/a/img", "xpath:idRelative"],
        ["xpath=//li[4]/div/div/div/div/span/a/img", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "9013948f-639f-4a3a-ae7f-58161c9e6bff",
      "comment": "",
      "command": "mouseOver",
      "target": "css=.nav-logo-link > .nav-logo-base",
      "targets": [
        ["css=.nav-logo-link > .nav-logo-base", "css:finder"],
        ["xpath=//div[@id='nav-logo']/a/span", "xpath:idRelative"],
        ["xpath=//span", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "e99052e2-1639-4a2d-a993-76d2377db3b4",
      "comment": "",
      "command": "mouseOver",
      "target": "css=.cropped-image-map-size:nth-child(2) img",
      "targets": [
        ["css=.cropped-image-map-size:nth-child(2) img", "css:finder"],
        ["xpath=//img[@alt='Desh ka dumdaar Smartphone']", "xpath:img"],
        ["xpath=//div[@id='hAWYNXKJRp8IWJI2hKQZ4w']/div/div/span/a/img", "xpath:idRelative"],
        ["xpath=//li[4]/div/div/div/div/span/a/img", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "1bcb8644-a361-45ca-ae44-6f1a0297fe57",
      "comment": "",
      "command": "click",
      "target": "linkText=Best Sellers",
      "targets": [
        ["linkText=Best Sellers", "linkText"],
        ["css=#nav-xshop > .nav-a:nth-child(2)", "css:finder"],
        ["xpath=//a[contains(text(),'Best Sellers')]", "xpath:link"],
        ["xpath=//div[@id='nav-xshop']/a", "xpath:idRelative"],
        ["xpath=//a[contains(@href, '/gp/bestsellers/?ref_=nav_cs_bestsellers')]", "xpath:href"],
        ["xpath=//div[3]/div[2]/div/a", "xpath:position"],
        ["xpath=//a[contains(.,'Best Sellers')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "123bab8c-740c-4692-bb0c-fbc882e4c340",
      "comment": "",
      "command": "mouseOver",
      "target": "css=.zg_item:nth-child(3) .a-dynamic-image",
      "targets": [
        ["css=.zg_item:nth-child(3) .a-dynamic-image", "css:finder"],
        ["xpath=//img[@alt='The Power of your Subconscious Mind']", "xpath:img"],
        ["xpath=//div[@id='zg_left_col1']/div/div[2]/div/div[2]/a/div/img", "xpath:idRelative"],
        ["xpath=//div/img", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "f242d05c-bc7c-426e-b2e7-16e58bc32b91",
      "comment": "",
      "command": "mouseOut",
      "target": "css=.zg_item:nth-child(3) .a-dynamic-image",
      "targets": [
        ["css=.zg_item:nth-child(3) .a-dynamic-image", "css:finder"],
        ["xpath=//img[@alt='The Power of your Subconscious Mind']", "xpath:img"],
        ["xpath=//div[@id='zg_left_col1']/div/div[2]/div/div[2]/a/div/img", "xpath:idRelative"],
        ["xpath=//div/img", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "2626d4ec-b534-4941-b332-6896a44d2d75",
      "comment": "",
      "command": "click",
      "target": "css=.zg_item:nth-child(4) .a-dynamic-image",
      "targets": [
        ["css=.zg_item:nth-child(4) .a-dynamic-image", "css:finder"],
        ["xpath=//img[@alt='Indian Polity - For Civil Services and Other State Examinations | 6th Edition']", "xpath:img"],
        ["xpath=//div[@id='zg_left_col1']/div/div[3]/div/div[2]/a/div/img", "xpath:idRelative"],
        ["xpath=//div[3]/div/div[2]/a/div/img", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "20657358-c57e-4394-937d-9bfd75e56654",
      "comment": "",
      "command": "mouseOver",
      "target": "linkText=Gift Ideas",
      "targets": [
        ["linkText=Gift Ideas", "linkText"],
        ["css=#nav-xshop > .nav-a:nth-child(3)", "css:finder"],
        ["xpath=//a[contains(text(),'Gift Ideas')]", "xpath:link"],
        ["xpath=//div[@id='nav-xshop']/a[2]", "xpath:idRelative"],
        ["xpath=//a[contains(@href, '/gp/most-gifted/?ref_=nav_cs_giftideas')]", "xpath:href"],
        ["xpath=//div[3]/div[2]/div/a[2]", "xpath:position"],
        ["xpath=//a[contains(.,'Gift Ideas')]", "xpath:innerText"]
      ],
      "value": ""
    }]
  }],
  "suites": [{
    "id": "c469f0ef-912b-4b61-882f-35c6874be6e2",
    "name": "Default Suite",
    "persistSession": false,
    "parallel": false,
    "timeout": 300,
    "tests": ["482d0bf6-f601-4514-b423-06d458c6dc68"]
  }],
  "urls": ["https://www.amazon.in/"],
  "plugins": []
}